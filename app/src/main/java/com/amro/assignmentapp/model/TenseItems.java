package com.amro.assignmentapp.model;

import java.util.ArrayList;
import java.util.List;

public class TenseItems {
    public static final String PAST = "Past";
    public static final String PRESENT = "Present";
    public static final String FUTURE = "Future";
    private final List<MenuItem> items = new ArrayList<MenuItem>();

    public TenseItems() {
        items.add(
                new MenuItem(
                        PAST,
                        "Past Simple",
                        """
                                Formula: [ suffix + ed ]\s
                                                                
                                We use the simple past to show actions completed in the past, with no extra emphasis.                                                                                                                                           \s
                                For regular verbs, you form the simple past tense by adding the suffix –ed to the end of the verb (or just –d if the past tense verb already ends in an e).\s
                                Be careful of irregular past tense verbs, however. These don’t follow the normal rules and use their own unique forms for the past tense. For example, the past tense of the irregular verb go is went.\s
                                                                
                                Examples:\s
                                                                
                                Regular verbs: I picked up the glass, but it dropped from my hand.\s
                                Irregular verbs: This morning I went to the store, but I forgot the milk.\s
                                                                
                                """
                )
        );
        items.add(
                new MenuItem(
                        PAST,
                        "Past Continuous",
                        """
                                Formula: [was/were] + [present participle]\s
                                                                
                                Use the past continuous to show an ongoing action in the past, especially if the action was interrupted by another action.
                                It’s also used for habitual actions that occurred in the past but not in the present.
                                It’s usually used with adverbs like always or adverb phrases like all the time.\s
                                                      
                                Examples:\s
                                                                
                                My dog was whimpering in his sleep when the TV woke him up.\s
                                As kids, my friends and I were always getting into trouble.                        \s
                                """
                )
        );

        items.add(
                new MenuItem(
                        PAST,
                        "Past Perfect",
                        """
                                Formula: [had] + [been] + [present participle]\s
                                                                
                                The past perfect continuous tense is used just like the past perfect tense, except it describes ongoing actions that happened in the past instead of a one-time occurrence.
                                It’s often used with the words when, until, and before to connect it to another past action.\s
                                                                
                                Examples:
                                                                
                                Before he got his first job as a writer, he had been working as a proofreader.\s
                                I had been living on my friend’s couch for a year until they kicked me out.\s
                                """
                )
        );
        items.add(new MenuItem(
                PAST,
                "Past Perfect Continuous",
                """
                        Formula: [had] + [been] + [present participle]\s
                                                
                        The past perfect continuous tense is used just like the past perfect tense, except it describes ongoing actions that happened in the past instead of a one-time occurrence. It’s often used with the words when, until, and before to connect it to another past action.\s
                                                
                        Examples:\s
                        Before he got his first job as a writer, he had been working as a proofreader.\s
                        I had been living on my friend’s couch for a year until they kicked me out.\s
                        """
        ));

        items.add(new MenuItem(
                PRESENT,
                "Present Simple",
                """
                        Formula: [root form of the verb] + [s/es/ies]\s
                                                
                        The simple present is the most basic of the English tenses. It’s used for individual actions or habitual actions in the present.\s
                                                
                        Examples:\s
                        Today I feel like a million bucks!\s
                        My brother carries the groceries while my sister stays on the couch.\s
                        """
        ));

        items.add(new MenuItem(
                PRESENT,
                "Present Continuous",
                """
                        Formula: [am/is/are] + [present participle]\s
                                                
                        Use the present continuous to show an action happening right now or in the near future.\s
                                                
                        Examples:\s
                        I am reading The Hitchhiker’s Guide to the Galaxy for the fifth time!\s
                        We are eating pizza tonight.\s
                        """
        ));

        items.add(new MenuItem(
                PRESENT,
                "Present Perfect",
                """
                        Formula: [have/has] + [past participle]\s
                                                
                        The present perfect is used to describe actions that have a connection to the present moment, including repeated actions, actions that occurred at an unspecified time before now, and actions that were completed in the recent past.\s
                                                
                        Examples:\s
                        We have tricked him every April Fool’s Day since we were kids.\s
                        My niece has grown so much this year!\s
                        """
        ));

        items.add(new MenuItem(
                PRESENT,
                "Present Perfect Continuous",
                """
                        Formula: [have/has] + [been] + [present participle]\s
                                                
                        The present perfect continuous shows an ongoing action in the present that was started in the past. It is often used to emphasize the length of time.\s
                                                
                        Examples:\s
                        We have been waiting for over an hour!\s
                        The team has been practicing nonstop for the tournament.\s
                        """
        ));

        items.add(new MenuItem(
                FUTURE,
                "Future Simple",
                """
                        Formula: [will] + [root form of the verb]\s
                                                
                        Use the simple future for actions that have not happened yet but will later. It’s also used for predictions and promises.\s
                                                
                        Examples:\s
                        She will be president one day.\s
                        I will not go to the wedding without a date!\s
                        """
        ));

        items.add(new MenuItem(
                FUTURE,
                "Future Continuous",
                """
                        Formula: [will] + [be] + [present participle]\s
                                                
                        Use the future continuous tense for future actions happening over a period of time, especially when a specific time is mentioned.
                        It also shows more certainty and likelihood than the simple future.\s
                                                
                        Examples:\s
                        By this time tomorrow, I will be drinking margaritas on the beach.\s
                        We will be attending a meeting from noon until 3 p.m.\s
                        """
        ));

        items.add(new MenuItem(
                FUTURE,
                "Future Perfect",
                """
                        Formula: [will] + [have] + [past participle]\s
                                                
                        The future perfect shows an action that will be completed in the future by a specified time.
                        It’s often used with time expressions like by, before, at, or when.\s
                                                
                        Examples:\s
                        By the time you read this, I will have already left.\s
                        She will have eaten lunch before her sister even wakes up.\s
                        """
        ));

        items.add(new MenuItem(
                FUTURE,
                "Future Perfect Continuous",
                """
                        Formula: [will] + [have] + [been] + [present participle]\s
                                                
                        The future perfect continuous depicts future ongoing actions that continue up until a certain point.
                        Like the future perfect and future continuous, it’s used with a specified time.\s
                                                
                        Examples:\s
                        In ten minutes, my parents will have been waiting in traffic for four hours.\s
                        I will have been eating healthy for a whole year by September.\s
                        """
        ));

    }

    public List<MenuItem> getMenuItems(String category) {
        List<MenuItem> result = new ArrayList<>();
        for (MenuItem m : items) {
            if (m.category().equals(category)) {
                result.add(m);
            }
        }
        return result;
    }

    public String[] getCategories() {
        return items.stream()
                .map(MenuItem::category).distinct().toArray(String[]::new);
    }
}
