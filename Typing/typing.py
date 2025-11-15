import time
text = "My name is Oyinade"
print(text)

start = time.time()
user_input = input("Enter the text above :  ")	
end = time.time()
total_time  = end - start
total_seconds = total_time;
		
print(f"The total time taken is {total_seconds} seconds")
number_of_words = len(text.split(" "));
current_minutes =  total_seconds
word_per_minutes = number_of_words / current_minutes;

print(f"The word per minutes  {word_per_minutes}");	

	