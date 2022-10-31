import pickle
import os
import sys

ROOT_DIR = os.path.abspath("")
sys.path.append(ROOT_DIR)

token_pic_dir = os.path.join(ROOT_DIR +'\pickle_file\\') 

if not os.path.exists(token_pic_dir):
         os.makedirs(token_pic_dir)

car = {
"brand": "Ford",
"model": "Mustang",
"year": 1964
}

with open(token_pic_dir + 'dictionary.pickle', 'wb') as handle:
    pickle.dump(car, handle, protocol=pickle.HIGHEST_PROTOCOL)


with open(token_pic_dir +'dictionary.pickle', 'rb') as handle:
        dict_car = pickle.load(handle)

print(dict_car)