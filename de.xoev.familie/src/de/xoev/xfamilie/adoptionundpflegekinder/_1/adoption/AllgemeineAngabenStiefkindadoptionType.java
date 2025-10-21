/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeine Angaben Stiefkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allgemeine Angaben zu Stiefkindadoption
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerecht <em>Personensorgerecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt <em>Kontakt Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getArtKontaktJugendamt <em>Art Kontakt Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType()
 * @model extendedMetaData="name='AllgemeineAngabenStiefkindadoptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeineAngabenStiefkindadoptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hat das Kind Kontakt zu seinen leiblichen Eltern oder sonstigen Familienmitgliedern?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontakt Zu Leiblicher Familie</em>' attribute.
	 * @see #isSetKontaktZuLeiblicherFamilie()
	 * @see #unsetKontaktZuLeiblicherFamilie()
	 * @see #setKontaktZuLeiblicherFamilie(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_KontaktZuLeiblicherFamilie()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kontaktZuLeiblicherFamilie' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKontaktZuLeiblicherFamilie();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontakt Zu Leiblicher Familie</em>' attribute.
	 * @see #isSetKontaktZuLeiblicherFamilie()
	 * @see #unsetKontaktZuLeiblicherFamilie()
	 * @see #isKontaktZuLeiblicherFamilie()
	 * @generated
	 */
	void setKontaktZuLeiblicherFamilie(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKontaktZuLeiblicherFamilie()
	 * @see #isKontaktZuLeiblicherFamilie()
	 * @see #setKontaktZuLeiblicherFamilie(boolean)
	 * @generated
	 */
	void unsetKontaktZuLeiblicherFamilie();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kontakt Zu Leiblicher Familie</em>' attribute is set.
	 * @see #unsetKontaktZuLeiblicherFamilie()
	 * @see #isKontaktZuLeiblicherFamilie()
	 * @see #setKontaktZuLeiblicherFamilie(boolean)
	 * @generated
	 */
	boolean isSetKontaktZuLeiblicherFamilie();

	/**
	 * Returns the value of the '<em><b>Erlaeuterung Kontakt Zu Leiblicher Familie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erläuterung: Wenn ja, zu wem? Wenn nein, warum nicht?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>' attribute.
	 * @see #setErlaeuterungKontaktZuLeiblicherFamilie(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_ErlaeuterungKontaktZuLeiblicherFamilie()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='erlaeuterungKontaktZuLeiblicherFamilie' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErlaeuterungKontaktZuLeiblicherFamilie();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>' attribute.
	 * @see #getErlaeuterungKontaktZuLeiblicherFamilie()
	 * @generated
	 */
	void setErlaeuterungKontaktZuLeiblicherFamilie(String value);

	/**
	 * Returns the value of the '<em><b>Personensorgerecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei wem liegt das Personensorgerecht?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personensorgerecht</em>' containment reference.
	 * @see #setPersonensorgerecht(CodePersonensorgerechtType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_Personensorgerecht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personensorgerecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodePersonensorgerechtType getPersonensorgerecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerecht <em>Personensorgerecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personensorgerecht</em>' containment reference.
	 * @see #getPersonensorgerecht()
	 * @generated
	 */
	void setPersonensorgerecht(CodePersonensorgerechtType value);

	/**
	 * Returns the value of the '<em><b>Personensorgerecht Bei Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn Sonstige, bitte hier angeben
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personensorgerecht Bei Sonstige</em>' attribute.
	 * @see #setPersonensorgerechtBeiSonstige(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_PersonensorgerechtBeiSonstige()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='personensorgerechtBeiSonstige' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersonensorgerechtBeiSonstige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personensorgerecht Bei Sonstige</em>' attribute.
	 * @see #getPersonensorgerechtBeiSonstige()
	 * @generated
	 */
	void setPersonensorgerechtBeiSonstige(String value);

	/**
	 * Returns the value of the '<em><b>Geschpraech Ueber Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wurde bereits mit dem Kind über die geplante Adoption gesprochen?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschpraech Ueber Adoption</em>' attribute.
	 * @see #isSetGeschpraechUeberAdoption()
	 * @see #unsetGeschpraechUeberAdoption()
	 * @see #setGeschpraechUeberAdoption(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_GeschpraechUeberAdoption()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='geschpraechUeberAdoption' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGeschpraechUeberAdoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschpraech Ueber Adoption</em>' attribute.
	 * @see #isSetGeschpraechUeberAdoption()
	 * @see #unsetGeschpraechUeberAdoption()
	 * @see #isGeschpraechUeberAdoption()
	 * @generated
	 */
	void setGeschpraechUeberAdoption(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeschpraechUeberAdoption()
	 * @see #isGeschpraechUeberAdoption()
	 * @see #setGeschpraechUeberAdoption(boolean)
	 * @generated
	 */
	void unsetGeschpraechUeberAdoption();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geschpraech Ueber Adoption</em>' attribute is set.
	 * @see #unsetGeschpraechUeberAdoption()
	 * @see #isGeschpraechUeberAdoption()
	 * @see #setGeschpraechUeberAdoption(boolean)
	 * @generated
	 */
	boolean isSetGeschpraechUeberAdoption();

	/**
	 * Returns the value of the '<em><b>Reaktion Kind Gespraech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn ja, wann und wie hat das Kind darauf reagiert?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaktion Kind Gespraech</em>' attribute.
	 * @see #setReaktionKindGespraech(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_ReaktionKindGespraech()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='reaktionKindGespraech' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReaktionKindGespraech();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaktion Kind Gespraech</em>' attribute.
	 * @see #getReaktionKindGespraech()
	 * @generated
	 */
	void setReaktionKindGespraech(String value);

	/**
	 * Returns the value of the '<em><b>Kontakt Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hatten Sie bereits neben der Adoptionsstelle Kontakt zu anderen Stellen des Jugendamtes?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontakt Jugendamt</em>' attribute.
	 * @see #isSetKontaktJugendamt()
	 * @see #unsetKontaktJugendamt()
	 * @see #setKontaktJugendamt(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_KontaktJugendamt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kontaktJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKontaktJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt <em>Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontakt Jugendamt</em>' attribute.
	 * @see #isSetKontaktJugendamt()
	 * @see #unsetKontaktJugendamt()
	 * @see #isKontaktJugendamt()
	 * @generated
	 */
	void setKontaktJugendamt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt <em>Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKontaktJugendamt()
	 * @see #isKontaktJugendamt()
	 * @see #setKontaktJugendamt(boolean)
	 * @generated
	 */
	void unsetKontaktJugendamt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isKontaktJugendamt <em>Kontakt Jugendamt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kontakt Jugendamt</em>' attribute is set.
	 * @see #unsetKontaktJugendamt()
	 * @see #isKontaktJugendamt()
	 * @see #setKontaktJugendamt(boolean)
	 * @generated
	 */
	boolean isSetKontaktJugendamt();

	/**
	 * Returns the value of the '<em><b>Art Kontakt Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hatten Sie bereits Kontakt zum Jugendamt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Kontakt Jugendamt</em>' attribute.
	 * @see #setArtKontaktJugendamt(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_ArtKontaktJugendamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='artKontaktJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtKontaktJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#getArtKontaktJugendamt <em>Art Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Kontakt Jugendamt</em>' attribute.
	 * @see #getArtKontaktJugendamt()
	 * @generated
	 */
	void setArtKontaktJugendamt(String value);

	/**
	 * Returns the value of the '<em><b>Gerichtliche Regelung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liegt eine gerichtliche Regelung vor?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gerichtliche Regelung</em>' attribute.
	 * @see #isSetGerichtlicheRegelung()
	 * @see #unsetGerichtlicheRegelung()
	 * @see #setGerichtlicheRegelung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAllgemeineAngabenStiefkindadoptionType_GerichtlicheRegelung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='gerichtlicheRegelung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGerichtlicheRegelung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gerichtliche Regelung</em>' attribute.
	 * @see #isSetGerichtlicheRegelung()
	 * @see #unsetGerichtlicheRegelung()
	 * @see #isGerichtlicheRegelung()
	 * @generated
	 */
	void setGerichtlicheRegelung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGerichtlicheRegelung()
	 * @see #isGerichtlicheRegelung()
	 * @see #setGerichtlicheRegelung(boolean)
	 * @generated
	 */
	void unsetGerichtlicheRegelung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gerichtliche Regelung</em>' attribute is set.
	 * @see #unsetGerichtlicheRegelung()
	 * @see #isGerichtlicheRegelung()
	 * @see #setGerichtlicheRegelung(boolean)
	 * @generated
	 */
	boolean isSetGerichtlicheRegelung();

} // AllgemeineAngabenStiefkindadoptionType
