package com.example.android.javaquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;
    String scoreAndSummaryMessage = "CORRECTIONS AND RECAP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswerButton(View v) {

        // these check for the correct answer in the questions and updates totalScore

        questionOneChecker();
        questionTwoChecker();
        questionThreeChecker();
        questionFourChecker();
        questionFiveChecker();

        // this simply prints the to total score in a toast

        Toast.makeText(this, "You scored " + totalScore + "%", Toast.LENGTH_SHORT).show();
        totalScore = 0;
    }

    /**
     * This method updates the score by increasing
     * <p>
     * its value by one if the correct radio
     * <p>
     * button was checked in question 1
     */

    private void questionOneChecker() {
        RadioGroup questionOneRadioGroup = findViewById(R.id.question_one_radio_group);
        int checkedButtonInOne = questionOneRadioGroup.getCheckedRadioButtonId();

        /**
         *  This if else statement checks for the correctness
         *
         *  of question one and increases the @param totalScore
         *
         **/

        if (checkedButtonInOne == R.id.false_radio_button1) {
            totalScore += 20;
            scoreAndSummaryMessage += "\n\n\n";
            scoreAndSummaryMessage += "You got question 1";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is really False.";

        } else {
            scoreAndSummaryMessage += "\n\n\n";
            scoreAndSummaryMessage += "You failed question 1";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is False.";
        }

        scoreAndSummaryMessage += "\n";  // this line simply creates an empty line
    }

    /**
     * This method checks to see that only the two correct
     * <p>
     * answers in question 2 were checked, and then updates
     * <p>
     * the @param totalScore
     */

    private void questionTwoChecker() {
        CheckBox factoryMethodCheckBox = findViewById(R.id.factory_method_checkbox);
        CheckBox usingAConstructorCheckBox = findViewById(R.id.calling_a_constructor_checkbox);
        boolean factoryMethodIsChecked = factoryMethodCheckBox.isChecked();
        boolean usingAConstructorIsChecked = usingAConstructorCheckBox.isChecked();

        /**
         * These if else statements check to know if the correct answers
         *
         * were checked and increases the totalScore only when the correct
         *
         * are checked
         */

        if (factoryMethodIsChecked && usingAConstructorIsChecked) {
            totalScore += 20;
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "Great work on question 2.";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "Factory method or using Constructor";
            scoreAndSummaryMessage += " are both correct.";

        } else {
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You failed question 2.";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "Only the two correct answers must be checked.";
            scoreAndSummaryMessage += " They are Factory method";
            scoreAndSummaryMessage += " and Using a constructor";
        }

        scoreAndSummaryMessage += "\n";

    }

    /**
     * This method checks for the correct answer text
     * <p>
     * input in question 3 and updates the totalScore
     * <p>
     * variable if the answer input is correct
     */

    private void questionThreeChecker() {
        EditText questionTwoAnswerInput = findViewById(R.id.question_three_answer_input);
        String answerInputOfQuestionTwo = questionTwoAnswerInput.getText().toString().toLowerCase();
        String possibleCorrectAnswerInputOne = "private";
        String possibleCorrectAnswerInputTwo = possibleCorrectAnswerInputOne + " ";
        possibleCorrectAnswerInputTwo += "access modifier";
        if (answerInputOfQuestionTwo.equals(possibleCorrectAnswerInputOne)) {
            totalScore += 20;
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You got question 3";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is indeed \"private\".";
        } else if (answerInputOfQuestionTwo.equals(possibleCorrectAnswerInputTwo)) {
            totalScore += 20;
            scoreAndSummaryMessage = "You got question 3";
        } else {
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You failed question 3";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is \"private\".";
        }

        scoreAndSummaryMessage += "\n";

    }

    /**
     * This method checks for the correct answer text
     * <p>
     * input in question 4 and updates the totalScore
     * <p>
     * variable if the answer input is correct
     */

    private void questionFourChecker() {
        EditText questionFourAnswerInput = findViewById(R.id.question_four_answer_input);
        String answerInputOfQuestionFour = questionFourAnswerInput.getText().toString().toLowerCase();
        String possibleCorrectAnswerInputOne = "object";
        String possibleCorrectAnswerInputTwo = possibleCorrectAnswerInputOne + " ";
        possibleCorrectAnswerInputTwo += "data types";

        //These if else statements check for the correctness of the answer inputted by the user

        if (answerInputOfQuestionFour.equals(possibleCorrectAnswerInputOne)) {
            totalScore += 20;
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You got question 4";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is indeed \"object data types\".";

        } else if (answerInputOfQuestionFour.equals(possibleCorrectAnswerInputTwo)) {
            totalScore += 20;
            scoreAndSummaryMessage = "You got question 4";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is indeed \"object data types\".";

        } else {
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You failed question 4";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is \"object data types\".";
        }

        scoreAndSummaryMessage += "\n";
    }

    /**
     * This method updates the score by increasing
     * <p>
     * its value by one if the correct radio
     * <p>
     * button was checked in question 5
     */

    private void questionFiveChecker() {
        RadioGroup questionFiveRadioGroup = findViewById(R.id.question_five_radio_group);
        int checkedButtonInFive = questionFiveRadioGroup.getCheckedRadioButtonId();

        /**
         *  This if else statement checks for the correctness
         *
         *  of question 5 and increases the @param totalScore
         *
         **/

        if (checkedButtonInFive == R.id.false_radio_button5) {
            totalScore += 20;
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You got question 5";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is False. Semicolons are\'nt";
            scoreAndSummaryMessage += " used to start statements in Java";

        } else {
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "You failed question 5";
            scoreAndSummaryMessage += "\n";
            scoreAndSummaryMessage += "The correct answer is False. Semicolons are\'nt";
            scoreAndSummaryMessage += " used to start statements in Java";
        }

        scoreAndSummaryMessage += "\n";  // this line simply creates an empty line
        displayMessage(scoreAndSummaryMessage);
    }

    /**
     * This method displays the summary text view to shows the corrections
     * <p>
     * for failed questions and then clears the values of the
     * <p>
     * scoreAndSummaryMessage
     */

    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.score_and_summary);
        orderSummaryTextView.setText(message);
        scoreAndSummaryMessage = "CORRECTIONS AND RECAP";

    }


}
