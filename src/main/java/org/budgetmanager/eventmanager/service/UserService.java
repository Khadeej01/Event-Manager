//package org.budgetmanager.eventmanager.service;
//
//import org.budgetmanager.eventmanager.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.budgetmanager.eventmanager.repository.UserRepository;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public String register(User user) {
//        try {
//            if (userRepository.findByEmail(user.getEmail()).isPresent()) {
//                return "Email déjà utilisé";
//            }
//            userRepository.save(user);
//            return "Inscription réussie !";
//        } catch (Exception e) {
//            return "Erreur lors de l'inscription : " + e.getMessage();
//        }
//    }
//
//    public String login(String email, String password) {
//        try {
//            return userRepository.findByEmail(email)
//                    .filter(u -> u.getMotDePasse().equals(password))
//                    .map(u -> "Connexion réussie ! Bienvenue " + u.getPrenom())
//                    .orElse("Email ou mot de passe invalide");
//        } catch (Exception e) {
//            return "Erreur de connexion : " + e.getMessage();
//        }
//    }
//}
