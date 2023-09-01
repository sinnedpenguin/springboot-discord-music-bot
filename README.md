# Springboot Discord Music Bot

A simple Discord bot built with Spring Boot that allows you to play music in voice channels.

## Getting Started

Follow these steps to set up and run the bot on your own server.

### Prerequisites

- Java 17
- Maven
- Discord Bot Token

### Installation

1. **Clone the repository:**
   
   ```shell
   git clone https://github.com/sinnedpenguin/springboot-discord-music-bot.git

2. Open the application.yml file in the src/main/resources directory and paste your Discord bot token under the bot.token field:

   ```shell
   bot:
     token: "YOUR_BOT_TOKEN"

3. **Build the project:**

   ```shell
   mvn clean package

4. **Run the application**

### Usage

Use these commands in a Discord text channel to control the bot in a voice channel.

* /play
* /skip
* /stop
* /queue
* /repeat
* /nowplaying
