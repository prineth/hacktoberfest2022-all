import pandas as pd 
import os
import sys


ROOT_DIR = os.path.abspath("")
sys.path.append(ROOT_DIR)

data = pd.read_csv(os.path.join(ROOT_DIR +'\CSV\Sentiment.csv'))

print(data.head)