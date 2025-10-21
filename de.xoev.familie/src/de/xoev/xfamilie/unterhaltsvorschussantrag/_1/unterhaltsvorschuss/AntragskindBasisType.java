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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragskind Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Antragskind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburtsurkunde <em>Geburtsurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthaltstitel <em>Aufenthaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAufenthalt <em>Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getEinkuenfte <em>Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSonstigeLeistung <em>Sonstige Leistung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAnderePersonVerstorben <em>Andere Person Verstorben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getMitbetreuungDurchAnderenElternteil <em>Mitbetreuung Durch Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSchule <em>Schule</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStudium <em>Studium</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAktenzeichen <em>Aktenzeichen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType()
 * @model extendedMetaData="name='Antragskind.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragskindBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des Antragskindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOptionalType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Geburt des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtGeburtsortOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Geburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtGeburtsortOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtGeburtsortOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburtsurkunde</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsurkunde</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Geburtsurkunde()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='geburtsurkunde' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getGeburtsurkunde();

	/**
	 * Returns the value of the '<em><b>Aufenthaltstitel</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden. Der hier gemeinte Nachweis ist ein Aufenthaltstitel. Regel: Falls das Kind nicht aus Deutschland/Schweiz/EWR stammt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltstitel</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Aufenthaltstitel()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='aufenthaltstitel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAufenthaltstitel();

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Staatsangehörigkeiten des Kindes. Regel: Bei mehreren Staatsangehörigkeiten einer Person ist immer Deutsch/Schweiz/EU/EWR zu übertragen, wenn eine dieser besteht, ansonsten sonstiges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(StaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(StaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Aufenthalt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Aufenthaltsort des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthalt</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Aufenthalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aufenthalt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AufenthaltKindBasisType> getAufenthalt();

	/**
	 * Returns the value of the '<em><b>Vertretung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Vertretung des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertretung</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Vertretung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VertretungType> getVertretung();

	/**
	 * Returns the value of the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu den Einkünften des Antragskind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Einkuenfte()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EinkuenfteKindType> getEinkuenfte();

	/**
	 * Returns the value of the '<em><b>Sonstige Leistung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu sonstigen Leistungen des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Leistung</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_SonstigeLeistung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sonstigeLeistung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SonstigeLeistungKindType> getSonstigeLeistung();

	/**
	 * Returns the value of the '<em><b>Andere Person Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der andere Elternteil, der andere Stiefelternteil oder der eingetragene Lebenspartner des alleinerziehenden Elternteils verstorben ist. Regel: Falls "true" fallen Angaben zu "AndererElternteil" weg. Es muss dann eine Sterbeurkunde geliefert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Andere Person Verstorben</em>' containment reference.
	 * @see #setAnderePersonVerstorben(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_AnderePersonVerstorben()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anderePersonVerstorben' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getAnderePersonVerstorben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAnderePersonVerstorben <em>Andere Person Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Andere Person Verstorben</em>' containment reference.
	 * @see #getAnderePersonVerstorben()
	 * @generated
	 */
	void setAnderePersonVerstorben(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Mitbetreuung Durch Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Mitbetreuung durch den anderen Elternteil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitbetreuung Durch Anderen Elternteil</em>' containment reference.
	 * @see #setMitbetreuungDurchAnderenElternteil(TatsacheMitFreitextType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_MitbetreuungDurchAnderenElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mitbetreuungDurchAnderenElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitFreitextType getMitbetreuungDurchAnderenElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getMitbetreuungDurchAnderenElternteil <em>Mitbetreuung Durch Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitbetreuung Durch Anderen Elternteil</em>' containment reference.
	 * @see #getMitbetreuungDurchAnderenElternteil()
	 * @generated
	 */
	void setMitbetreuungDurchAnderenElternteil(TatsacheMitFreitextType value);

	/**
	 * Returns the value of the '<em><b>Schule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Schule des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schule</em>' containment reference.
	 * @see #setSchule(SchuleType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Schule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schule' namespace='##targetNamespace'"
	 * @generated
	 */
	SchuleType getSchule();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getSchule <em>Schule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schule</em>' containment reference.
	 * @see #getSchule()
	 * @generated
	 */
	void setSchule(SchuleType value);

	/**
	 * Returns the value of the '<em><b>Studium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Studium des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Studium</em>' containment reference.
	 * @see #setStudium(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Studium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studium' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getStudium();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getStudium <em>Studium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studium</em>' containment reference.
	 * @see #getStudium()
	 * @generated
	 */
	void setStudium(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Geschlecht des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Geschlecht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktenzeichen des betroffenen Kindes zum Unterhaltsvorschuss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #setAktenzeichen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragskindBasisType_Aktenzeichen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType#getAktenzeichen <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #getAktenzeichen()
	 * @generated
	 */
	void setAktenzeichen(String value);

} // AntragskindBasisType
