# Readability Score
**Level:** Hard

**About:**

Everyone has their own personal reading history, and as we grow up, we are able to comprehend more and more complicated texts. But how do you estimate the level of difficulty of a given text, and how do you teach a computer to do that? In this project, you will find it out: write a program that determines how difficult the text is and for which age it is most suitable.

**Result:**

Learn to call programs from the command-line and get more experience with using regexes and Math class. 

### Project status

Implemented:
- [Stage 2/4](#stage-24)

To implement :
- Stage 3/4
- Stage 4/4


### Stage 2/4

**Description**

But the real text can be pretty long and still can be easy to read isn't it? There need to be done another approach. How about calculating a number of words in each sentence? Clearly, if each sentence of the text contains a lot of words then this text is hard to read.

Let's suppose that if the text contains on average more than 10 words per sentence, then this text is hard to read. Otherwise, this text is easy to read. Don't worry, we will consider more scientific ways in the next stages.

The input contains a single line with text. Output "HARD" if the text is hard to read and "EASY" if the text is easy to read.

For example, the first example contains two sentences with 6 and 10 words (numbers also counts as words) so the average is 8 and this is less than 10. In the second example, there is also 2 sentences but with 6 and 16 words so the average is 11 and this is greater than 10. If the average is equal to 10 then the text is still considered easy to read.

Don't forget that the sentences can end with a dot as well as with an exclamation mark and a question mark. But the last sentence can be with or without a punctuation character at the end.

**Output examples**
```
>This text is simple to read! It has on average less than 10 words per sentence.
>EASY
```
```
>This text is hard to read. It contains a lot of sentenses as well as a lot of words in each sentence
>HARD
```
