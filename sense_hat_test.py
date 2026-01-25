from sense_emu import SenseHat
import datetime 
import time
import math
import json


sense = SenseHat()

T=1/1440

if 3600*T<1:
    T = 1/720

def warten_bis_slot(T):
    jetzt = datetime.datetime.now()

    stunde = jetzt.hour
    minute = jetzt.minute
    sekunde = jetzt.second


    curr_sec = stunde*60*60+60*minute+sekunde
    tot_sec = math.ceil(math.floor(curr_sec/(60*60*T))*60*60*T + 60*60*T)


    # nächste Minute bestimmen, die durch T teilbar ist
    next_hour = math.floor(tot_sec/(60*60))
    next_min = math.floor(tot_sec/60-next_hour*60)
    next_sec = math.ceil(tot_sec-next_min*60-next_hour*60*60)
    
    zielzeit = jetzt.replace(hour=next_hour, minute=next_min, second=next_sec, microsecond=0)
    wartezeit = (zielzeit - datetime.datetime.now()).total_seconds()
    time.sleep(wartezeit)



while True:

    warten_bis_slot(T)

    now = datetime.datetime.now()

    temp = sense.get_temperature()
    try:
        with open('temperature_dict.json', "r", encoding="utf-8") as file:
            temp_dict = json.load(file)
        print('Loading the question file was succesfull.')
    except FileNotFoundError:
        temp_dict = {}
    except json.JSONDecodeError:
        temp_dict = {}

    print(len(temp_dict))

    with open('temperature_dict.json', 'w', encoding='utf-8') as f:

        temp_dict.update({str(now.strftime("%Y-%m-%d %H:%M:%S")) : temp})

        epsilon = min(24*3*2,math.floor(24*3/T))

        while len(temp_dict)>epsilon:
            del temp_dict[next(iter(temp_dict))]

        json.dump(temp_dict, f, ensure_ascii=False, indent=4)

    print(f"{datetime.datetime.now()} -> {temp:.2f} °C")

    