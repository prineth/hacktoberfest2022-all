import glob
import os
import sys
import argparse
from datetime import datetime

def read_and_write(folder_path, output_path):
    
    for file_path in glob.glob(folder_path + '/*.*'):
      
        base_name = os.path.basename(file_path)
      
        file_name = os.path.splitext(base_name)[0]

        file_list.write(str(file_name) + ' \n')
        print("file_name : ", file_name)


if __name__ == "__main__":

    
    parser = argparse.ArgumentParser(
        description='Get user aguments')

    parser.add_argument("-folder_path",
                        "--folder_path",
                        help='Enter the input folder path',
                        required=True)
    parser.add_argument("-output",
                        "--output_path",
                        help='Enter the output path',
                        required=True)

    
    args = parser.parse_args()
    folder_path = args.folder_path
    output_path = str(args.output_path) + '/' + 'file_names_txt/'

    
    if not os.path.exists(output_path):
        os.makedirs(output_path)

    
    current_date_time = datetime.now()
    date_time = current_date_time.strftime("%d_%m_%Y_%H_%M")

    
    file_list = open(
        output_path + "file_names" + str(date_time) + ".txt", "w")

    
    read_and_write(folder_path=folder_path, output_path=output_path)
