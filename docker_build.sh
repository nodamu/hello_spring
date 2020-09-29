
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin

./gradlew jib -Ptage=$SHA && ./gradlew jib -Ptag=latest