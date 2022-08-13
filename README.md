# Usage

This class provides the various methods needed to assist in the process of dealing with time data types.

## Usage

```java

String format = JikanUtil.TIME_YYYYMMDDHHMMSS

# get current time in long format
JikanUtil.currTimeInLong(TIME_YYYYMMDDHHMMSS) /* it will return as an example '1660377757000'
in java.lang.Long type */

# get current time in date format
JikanUtil.currTimeInDate(TIME_YYYYMMDDHHMMSS) /* it will return as an example 'Sat Aug 13 15:05:38 ICT 2022'
in java.util.Date type */

# get current time in date format
JikanUtil.currTimeInString(TIME_YYYYMMDDHHMMSS) /* it will return as an example '2022-08-13 15:07:16'
in java.lang.String type */
```

## Available Format

| Format String                 | Center Aligned      | Example String in simplified format |
| :---------------------------- | :------------------ | :---------------------------------- |
| JikanUtil.TIME_YYYYMMDDHHMMSS | yyyy-MM-dd HH:mm:ss | 2022-08-13 15:15:58                 |
| JikanUtil.TIME_YYYYMMDDHHMM   | yyyy-MM-dd HH:mm    | 2022-08-13 15:15                    |
| JikanUtil.TIME_YYYYMMDDHH     | yyyy-MM-dd HH       | 2022-08-13 15                       |
| JikanUtil.TIME_YYYYMMDD       | yyyy-MM-dd          | 2022-08-13                          |
| JikanUtil.TIME_YYYYMM         | yyyy-MM             | 2022-08                             |
| JikanUtil.TIME_YYYY           | yyyy                | 2022                                |
| JikanUtil.TIME_HH             | HH                  | 15                                  |
| JikanUtil.TIME_HHMM           | HH:mm               | 15:15                               |
| JikanUtil.TIME_MMSS           | mm:ss               | 15:58                               |
| JikanUtil.TIME_SS             | ss                  | 58                                  |

## License

[MIT](https://choosealicense.com/licenses/mit/)
