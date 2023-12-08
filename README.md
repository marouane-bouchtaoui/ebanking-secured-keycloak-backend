# Ebanking Backend
<hr>

<br>

Pour lancer le serveur keycloak on utilise cette commande:

```
kc.bat start-dev
```
<br>

Par défaut le serveur keycloak se trouve dans le port :8080 ,

<img src="caps/kc-int.png">

<br>

Premierement la création d'un realm :

<img src="caps/createRealm.png">

<br>
Pour la création des clients:

<img src="caps/createClient1.png">

<br>

On peut créer des clients sans "Client authentication" et pour s'authentifier on utilise soit le mot de passe, soit refresh token

<img src="caps/createClient2noAuth.png">

<br>

Si on active "Client authentication", on peut s'authentifier avec le id du client "wallet_client" et le clé secret

<img src="caps/createClient2Auth.png">
<img src="caps/credentials.png">

<br>

Apres on doit définir les routes :

<img src="caps/roots.png">

<br>
Apres la configuration du keycloak, on teste l'authentification:

<br>

Authentification par mot de passe :

<img src="caps/testPass.png">

<br>

Authentification par refresh token :

<img src="caps/testRefresh.png">

<br>

Authentification par secretKey :

<img src="caps/testSecret.png">

<br>

Puis on configure le backend avec keycloak:

<br>

Les dependences:

<img src="caps/dependencies.png">

<br>

La configuration du propriétés:

<img src="caps/props.png">

<br>

Les classes de sécurité utilisées:

<img src="caps/securityClass.png">

<br>

KeycloakAdapterConfig class:

<img src="caps/keycloakConfig.png">

<br>

SecurityConfig class:

<img src="caps/securityConfig.png">

<br>

Pour keycloakRestTemplate:

<img src="caps/kc-template.png">

<br>

Sécurisation des méthodes :

<img src="caps/sec-methodes.png">