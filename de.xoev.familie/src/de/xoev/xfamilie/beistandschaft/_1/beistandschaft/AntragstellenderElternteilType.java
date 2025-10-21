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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse <em>Abweichende Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getOeffentlicheLeistungen <em>Oeffentliche Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getSonstigeLeistungenBeschreibung <em>Sonstige Leistungen Beschreibung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType()
 * @model extendedMetaData="name='AntragstellenderElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das optionale Element Geburtsstaat wird hier nicht benötigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #setGeburtsdaten(GeburtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_Geburtsdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburtsdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #getGeburtsdaten()
	 * @generated
	 */
	void setGeburtsdaten(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Familienstand: An dieser Stelle sind nur die Angaben ledig, verheiratet, geschieden, verwitwet, eingetragene Lebenspartnerschaft, aufgehobene Lebenspartnerschaft und durch Tod aufgelöste Partnerschaft zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(CodeFamilienstandType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_Familienstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFamilienstandType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(CodeFamilienstandType value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_Adresse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, dass die Anschrift von der im Personalausweis angegebenen Anschrift abweicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abweichende Adresse</em>' attribute.
	 * @see #isSetAbweichendeAdresse()
	 * @see #unsetAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_AbweichendeAdresse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbweichendeAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse</em>' attribute.
	 * @see #isSetAbweichendeAdresse()
	 * @see #unsetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @generated
	 */
	void setAbweichendeAdresse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @generated
	 */
	void unsetAbweichendeAdresse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abweichende Adresse</em>' attribute is set.
	 * @see #unsetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @generated
	 */
	boolean isSetAbweichendeAdresse();

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse Perso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abweichende Adresse Perso</em>' containment reference.
	 * @see #setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_AbweichendeAdressePerso()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdressePerso' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAbweichendeAdressePerso();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse Perso</em>' containment reference.
	 * @see #getAbweichendeAdressePerso()
	 * @generated
	 */
	void setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit des Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Oeffentliche Leistungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Element vaterschaftAnerkannt ist nur zu befüllen, wenn für anliegenBeistandschaft u oder vu gewählt wurde. Wenn hier "Sonstige Leistungen" ausgewählt wurde, ist das Ausfüllen des Elements sonstigeLeistungenBeschreibung mandatorisch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oeffentliche Leistungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_OeffentlicheLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='oeffentlicheLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeBezugOeffentlicherLeistungenType> getOeffentlicheLeistungen();

	/**
	 * Returns the value of the '<em><b>Sonstige Leistungen Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nur zu befüllen, wenn im optionalen Element oeffentlicheLeistungen "Sonstige Leistungen" ausgewählt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Leistungen Beschreibung</em>' attribute.
	 * @see #setSonstigeLeistungenBeschreibung(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='sonstigeLeistungenBeschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSonstigeLeistungenBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getSonstigeLeistungenBeschreibung <em>Sonstige Leistungen Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstige Leistungen Beschreibung</em>' attribute.
	 * @see #getSonstigeLeistungenBeschreibung()
	 * @generated
	 */
	void setSonstigeLeistungenBeschreibung(String value);

} // AntragstellenderElternteilType
