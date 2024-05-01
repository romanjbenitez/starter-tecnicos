para prender docker:
    systemctl start docker

si falla para cambiar los permisos lo mejor es hacer
sudo chmod 666 /var/run/docker.sock

tecnicamente este proyecto de spring carga solo el docker compose pero sino se puede usar la vieja confiable
docker-compose up -d


