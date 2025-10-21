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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zum Kind Beendigung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getKindAdresse <em>Kind Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getAktenzeichenVorgangsnummer <em>Aktenzeichen Vorgangsnummer</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType()
 * @model extendedMetaData="name='AngabenZumKindBeendigungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZumKindBeendigungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Des Kindes</em>' containment reference.
	 * @see #setNameDesKindes(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType_NameDesKindes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameDesKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameDesKindes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getNameDesKindes <em>Name Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Des Kindes</em>' containment reference.
	 * @see #getNameDesKindes()
	 * @generated
	 */
	void setNameDesKindes(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #setGeburtsdaten(GeburtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType_Geburtsdaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburtsdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #getGeburtsdaten()
	 * @generated
	 */
	void setGeburtsdaten(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>' attribute.
	 * @see #isSetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #unsetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #setAnschriftStimmtMitAntragstellendemElternteilUeberein(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='anschriftStimmtMitAntragstellendemElternteilUeberein' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnschriftStimmtMitAntragstellendemElternteilUeberein();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>' attribute.
	 * @see #isSetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #unsetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @generated
	 */
	void setAnschriftStimmtMitAntragstellendemElternteilUeberein(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #setAnschriftStimmtMitAntragstellendemElternteilUeberein(boolean)
	 * @generated
	 */
	void unsetAnschriftStimmtMitAntragstellendemElternteilUeberein();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>' attribute is set.
	 * @see #unsetAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #setAnschriftStimmtMitAntragstellendemElternteilUeberein(boolean)
	 * @generated
	 */
	boolean isSetAnschriftStimmtMitAntragstellendemElternteilUeberein();

	/**
	 * Returns the value of the '<em><b>Kind Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Adresse</em>' containment reference.
	 * @see #setKindAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType_KindAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kindAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getKindAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getKindAdresse <em>Kind Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Adresse</em>' containment reference.
	 * @see #getKindAdresse()
	 * @generated
	 */
	void setKindAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen Vorgangsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktenzeichen oder Vorgangsnummer des Beistandschaft-Antrags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen Vorgangsnummer</em>' attribute.
	 * @see #setAktenzeichenVorgangsnummer(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichenVorgangsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenVorgangsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getAktenzeichenVorgangsnummer <em>Aktenzeichen Vorgangsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen Vorgangsnummer</em>' attribute.
	 * @see #getAktenzeichenVorgangsnummer()
	 * @generated
	 */
	void setAktenzeichenVorgangsnummer(String value);

} // AngabenZumKindBeendigungType
