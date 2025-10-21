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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorherige Behandlungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getBefruchtungsbehandlungen <em>Befruchtungsbehandlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch <em>Wiederholungsversuch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNameReproduktionseinrichtung <em>Name Reproduktionseinrichtung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getPostleitzahlReproduktionseinrichtung <em>Postleitzahl Reproduktionseinrichtung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung <em>Beratung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType()
 * @model extendedMetaData="name='VorherigeBehandlungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VorherigeBehandlungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bisher Gefoerderte Behandlungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bisher Gefoerderte Behandlungen</em>' attribute.
	 * @see #isSetBisherGefoerderteBehandlungen()
	 * @see #unsetBisherGefoerderteBehandlungen()
	 * @see #setBisherGefoerderteBehandlungen(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_BisherGefoerderteBehandlungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bisherGefoerderteBehandlungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBisherGefoerderteBehandlungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bisher Gefoerderte Behandlungen</em>' attribute.
	 * @see #isSetBisherGefoerderteBehandlungen()
	 * @see #unsetBisherGefoerderteBehandlungen()
	 * @see #isBisherGefoerderteBehandlungen()
	 * @generated
	 */
	void setBisherGefoerderteBehandlungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBisherGefoerderteBehandlungen()
	 * @see #isBisherGefoerderteBehandlungen()
	 * @see #setBisherGefoerderteBehandlungen(boolean)
	 * @generated
	 */
	void unsetBisherGefoerderteBehandlungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bisher Gefoerderte Behandlungen</em>' attribute is set.
	 * @see #unsetBisherGefoerderteBehandlungen()
	 * @see #isBisherGefoerderteBehandlungen()
	 * @see #setBisherGefoerderteBehandlungen(boolean)
	 * @generated
	 */
	boolean isSetBisherGefoerderteBehandlungen();

	/**
	 * Returns the value of the '<em><b>Befruchtungsbehandlungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Befruchtungsbehandlungen</em>' containment reference.
	 * @see #setBefruchtungsbehandlungen(BefruchtungsbehandlungenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_Befruchtungsbehandlungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='befruchtungsbehandlungen' namespace='##targetNamespace'"
	 * @generated
	 */
	BefruchtungsbehandlungenType getBefruchtungsbehandlungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getBefruchtungsbehandlungen <em>Befruchtungsbehandlungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Befruchtungsbehandlungen</em>' containment reference.
	 * @see #getBefruchtungsbehandlungen()
	 * @generated
	 */
	void setBefruchtungsbehandlungen(BefruchtungsbehandlungenType value);

	/**
	 * Returns the value of the '<em><b>Wiederholungsversuch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiederholungsversuch</em>' attribute.
	 * @see #isSetWiederholungsversuch()
	 * @see #unsetWiederholungsversuch()
	 * @see #setWiederholungsversuch(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_Wiederholungsversuch()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='wiederholungsversuch' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWiederholungsversuch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch <em>Wiederholungsversuch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiederholungsversuch</em>' attribute.
	 * @see #isSetWiederholungsversuch()
	 * @see #unsetWiederholungsversuch()
	 * @see #isWiederholungsversuch()
	 * @generated
	 */
	void setWiederholungsversuch(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch <em>Wiederholungsversuch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWiederholungsversuch()
	 * @see #isWiederholungsversuch()
	 * @see #setWiederholungsversuch(boolean)
	 * @generated
	 */
	void unsetWiederholungsversuch();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch <em>Wiederholungsversuch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wiederholungsversuch</em>' attribute is set.
	 * @see #unsetWiederholungsversuch()
	 * @see #isWiederholungsversuch()
	 * @see #setWiederholungsversuch(boolean)
	 * @generated
	 */
	boolean isSetWiederholungsversuch();

	/**
	 * Returns the value of the '<em><b>Name Reproduktionseinrichtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Reproduktionseinrichtung</em>' attribute.
	 * @see #setNameReproduktionseinrichtung(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_NameReproduktionseinrichtung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='nameReproduktionseinrichtung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameReproduktionseinrichtung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNameReproduktionseinrichtung <em>Name Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Reproduktionseinrichtung</em>' attribute.
	 * @see #getNameReproduktionseinrichtung()
	 * @generated
	 */
	void setNameReproduktionseinrichtung(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl Reproduktionseinrichtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postleitzahl Reproduktionseinrichtung</em>' attribute.
	 * @see #setPostleitzahlReproduktionseinrichtung(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='postleitzahlReproduktionseinrichtung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostleitzahlReproduktionseinrichtung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getPostleitzahlReproduktionseinrichtung <em>Postleitzahl Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl Reproduktionseinrichtung</em>' attribute.
	 * @see #getPostleitzahlReproduktionseinrichtung()
	 * @generated
	 */
	void setPostleitzahlReproduktionseinrichtung(String value);

	/**
	 * Returns the value of the '<em><b>Beratung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beratung über die medizinischen, psychischen und sozialen Aspekte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beratung</em>' attribute.
	 * @see #isSetBeratung()
	 * @see #unsetBeratung()
	 * @see #setBeratung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_Beratung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='beratung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeratung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung <em>Beratung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beratung</em>' attribute.
	 * @see #isSetBeratung()
	 * @see #unsetBeratung()
	 * @see #isBeratung()
	 * @generated
	 */
	void setBeratung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung <em>Beratung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeratung()
	 * @see #isBeratung()
	 * @see #setBeratung(boolean)
	 * @generated
	 */
	void unsetBeratung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung <em>Beratung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beratung</em>' attribute is set.
	 * @see #unsetBeratung()
	 * @see #isBeratung()
	 * @see #setBeratung(boolean)
	 * @generated
	 */
	boolean isSetBeratung();

	/**
	 * Returns the value of the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Vierter Versuch</em>' containment reference.
	 * @see #setNachweisVierterVersuch(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVorherigeBehandlungenType_NachweisVierterVersuch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisVierterVersuch' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweisVierterVersuch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Vierter Versuch</em>' containment reference.
	 * @see #getNachweisVierterVersuch()
	 * @generated
	 */
	void setNachweisVierterVersuch(NachweisdokumentType value);

} // VorherigeBehandlungenType
