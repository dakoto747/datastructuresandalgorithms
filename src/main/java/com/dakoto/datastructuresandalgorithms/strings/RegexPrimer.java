package com.dakoto.datastructuresandalgorithms.strings;

public class RegexPrimer {
    /*
    Useful Java classes & methods
Most languages have a regular expressions implementation either baked in or provided by a library. Java is no exception. Below are the classes you have to know in order to be effective using regular expressions in Java.

Pattern
Pattern is a compiled representation of a regular expression. Below is the list of the most frequently used methods in the Pattern class API.

Pattern compile(String regex) – Compiles the given regular expression into a pattern.

Pattern compile(String regex, int flags) – compiles the given regular expression into a pattern with the given flags.

boolean matches(String regex) – returns whether or not this string matches the given regular expression.

String[] split(CharSequence input) – splits the given input sequence around matches of this pattern.

String quote(String s) – returns a literal pattern String for the specified String s.

Predicate asPredicate() – creates a predicate which can be used to match a string.

Matcher
A matcher is the engine that performs match operations on a character sequence by interpreting a Pattern. Below is the list of the most frequently used methods in the Matcher class API.

boolean matches() – attempts to match the entire region against the pattern.

boolean find() – attempts to find the next subsequence of the input that matches the pattern.

int start() – returns the start index of the last match.

int end() – returns the offset after the last character matched.

By compiling a pattern, obtaining a matcher for it, you can match many texts for the pattern efficiently. So if you expect to process lots of texts, compile a matcher, cache it and use it repeatedly.

Java Regex syntax
Let’s move on now to the syntax for Java regular expressions. The Pattern.compile method takes a String, which is the regex that defines a set of matching strings. Naturally, it has to have a tricky syntax, otherwise a single string defining the pattern can only represent itself.

A regular character in the regex syntax matches that character in the text. If you’ll create a Pattern with Pattern.compile("a") it will only match only the String “a”. There is also an escape character, which is the backslash “\”. It is used to distinguish when the pattern contains an instruction in the syntax or a character. Let’s look at an example as to why we need an escape character. Imagine “[” has a special meaning in the regular expression syntax (it has). How can you determine if “[” is a command to the matching engine or a pattern containing only the bracket? You cannot, so to specify the characters that are also the commands in the syntax you need to escape them. It means “\[” is a pattern for the string “[“, and “[” is part of a command. What about trying to match a backslash? You need to escape it too, so be prepared to see something like “\\\\” in the regex code.

Character classes
On top of specifying the expressions that contain individual characters only, you can define the whole classes of characters. Think of them as sets, if a character in some text belongs to the character class, it is matched.

Here is a table with the most used character classes.
[abc] simple, matches a or b, or c.
[\^abc] negation, matches everything except a, b, or c.
[a-c] range, matches a or b, or c.
[a-c[f-h]] union, matches a, b, c, f, g, h.
[a-c&&[b-c]] intersection, matches b or c.
[a-c&&[\^b-c]] subtraction, matches only a.
For your convenience, there are some useful classes defined already. For example, digits are a perfect example of a useful character class. For example a 5 digit number could be coded into a pattern as “[0-9][0-9][0-9][0-9][0-9]”, but it’s quite ugly. So there’s a shorthand for that: “\d”.

Here are the other classes you need to know.
. Any character
\d A digit: [0-9]
\D A non-digit: [\^0-9]
\s A whitespace character: [ \t\n\x0B\f\r]
\S A non-whitespace character: [\^\s]
\w A word character: [a-zA-Z_0-9]
\W A non-word character: [\^\w]
Note that the letter specifying a predefined character class is typically lowercase, the uppercase version tends to mean the negation of the class.

Also, note that a dot “.” is a character class, which contains all the characters. Particularly useful, but remember to escape it when you need to match the actual dot character.

Boundary matchers
Next, there’s syntax to specify the position of the matched sequence in the original text you’re searching. If you only need to filter out the strings that start with an email address or something, this is extremely useful.

^ The beginning of a line.
$ The end of a line.
\b A word boundary.
\B A non-word boundary.
\A The beginning of the input.
\G The end of the previous match.
\Z The end of the input but for the final terminator, if any.
\z The end of the input.
A noteworthy combination of the boundary matchers is the “^pattern$” which will only match the text if it is the full pattern.

Logical operations
Now we’re getting into more advanced territory. If a pattern is more than a single character long, it will match a longer string too. In general “XY” in the regex syntax matches X followed by Y. However, there’s also an OR operation, denoted by the post “|”. The “X|Y” regex means it is either X or Y. This is a very powerful feature; you can combine the character classes or sequences of characters (include them in brackets).

Quantifiers
On top of everything, you can say how many times the sequence of characters can be repeated for the match. The regex “1” only matches the input “1”, but if we need to match a string of any length consisting of the character “1” you need to use one of the following quantifiers.
* matches zero or more occurrences.
+ matches one or more occurrences.
? matches zero or one occurrence.
Groups and backreferences
A group is a captured subsequence of characters which may be used later in the expression with a backreference. We’ve mentioned already that if you enclose a group of characters in parentheses, you can apply quantifiers or logical or to the whole group. What is even more awesome is that you can refer to the actual characters in the text matched by the group, later.
Here’s how you do it:
(...) – defines a group, in the parantheses
\N – refers to a matched group
For example:
(\d\d) – a group of two digits
(\d\d)/\1– two digits repeated twice, \1 – refers to the matched group, so this regular expression matches the strings that look like “aabb” where a and b are both digits.

Pattern flags
Remember when we talked about the useful API in Java for the regular expressions, there was a method to compile a pattern that took the flags. These will control how the pattern behaves.

Here are some flags that can be useful here and there.
Pattern.CASE_INSENSITIVE – enables case-insensitive matching
Pattern.COMMENTS – whitespace and comments starting with # are ignored until the end of a line.
Pattern.MULTILINE – one expression can match multiple lines.
Pattern.DOTALL – the expression “.” matches any character, including a line terminator
Pattern.UNIX_LINES – only the ‘\n’ line terminator is recognized in the behavior of ., ^, and $.
Conclusion
In this post, we looked at the regular expressions in Java and the most useful classes, API, and syntax definitions for them. All that information is neatly organized on a single A4 page cheat sheet that you can print out and have handy for when you find yourself counting those backslashes once again.
     */

}
