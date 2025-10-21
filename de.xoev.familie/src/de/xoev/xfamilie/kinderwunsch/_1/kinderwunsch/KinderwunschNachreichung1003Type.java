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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachreichung1003 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNachreichung <em>Nachreichung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type()
 * @model extendedMetaData="name='kinderwunsch.nachreichung.1003_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KinderwunschNachreichung1003Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Bundesland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundesland</em>' containment reference.
	 * @see #setBundesland(CodeBundeslandType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_Bundesland()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bundesland' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeBundeslandType getBundesland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBundesland <em>Bundesland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundesland</em>' containment reference.
	 * @see #getBundesland()
	 * @generated
	 */
	void setBundesland(CodeBundeslandType value);

	/**
	 * Returns the value of the '<em><b>Bearbeitungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitungsnummer</em>' attribute.
	 * @see #setBearbeitungsnummer(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_Bearbeitungsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='bearbeitungsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBearbeitungsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsnummer</em>' attribute.
	 * @see #getBearbeitungsnummer()
	 * @generated
	 */
	void setBearbeitungsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Nichtaustragende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nichtaustragende Person</em>' containment reference.
	 * @see #setNichtaustragendePerson(PersonendatenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_NichtaustragendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nichtaustragendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getNichtaustragendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNichtaustragendePerson <em>Nichtaustragende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nichtaustragende Person</em>' containment reference.
	 * @see #getNichtaustragendePerson()
	 * @generated
	 */
	void setNichtaustragendePerson(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antragstellende Person</em>' containment reference.
	 * @see #setAntragstellendePerson(PersonendatenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_AntragstellendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getAntragstellendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getAntragstellendePerson <em>Antragstellende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellende Person</em>' containment reference.
	 * @see #getAntragstellendePerson()
	 * @generated
	 */
	void setAntragstellendePerson(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Nachreichung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachreichung</em>' containment reference.
	 * @see #setNachreichung(NachreichungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_Nachreichung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachreichung' namespace='##targetNamespace'"
	 * @generated
	 */
	NachreichungType getNachreichung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNachreichung <em>Nachreichung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachreichung</em>' containment reference.
	 * @see #getNachreichung()
	 * @generated
	 */
	void setNachreichung(NachreichungType value);

	/**
	 * Returns the value of the '<em><b>Datenschutzerklaerung Der Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenschutzerklaerung Der Foerderstelle</em>' attribute.
	 * @see #isSetDatenschutzerklaerungDerFoerderstelle()
	 * @see #unsetDatenschutzerklaerungDerFoerderstelle()
	 * @see #setDatenschutzerklaerungDerFoerderstelle(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzerklaerungDerFoerderstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDatenschutzerklaerungDerFoerderstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzerklaerung Der Foerderstelle</em>' attribute.
	 * @see #isSetDatenschutzerklaerungDerFoerderstelle()
	 * @see #unsetDatenschutzerklaerungDerFoerderstelle()
	 * @see #isDatenschutzerklaerungDerFoerderstelle()
	 * @generated
	 */
	void setDatenschutzerklaerungDerFoerderstelle(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatenschutzerklaerungDerFoerderstelle()
	 * @see #isDatenschutzerklaerungDerFoerderstelle()
	 * @see #setDatenschutzerklaerungDerFoerderstelle(boolean)
	 * @generated
	 */
	void unsetDatenschutzerklaerungDerFoerderstelle();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datenschutzerklaerung Der Foerderstelle</em>' attribute is set.
	 * @see #unsetDatenschutzerklaerungDerFoerderstelle()
	 * @see #isDatenschutzerklaerungDerFoerderstelle()
	 * @see #setDatenschutzerklaerungDerFoerderstelle(boolean)
	 * @generated
	 */
	boolean isSetDatenschutzerklaerungDerFoerderstelle();

	/**
	 * Returns the value of the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute.
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bestaetigungRichtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBestaetigungRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute.
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @generated
	 */
	void setBestaetigungRichtigkeitAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetBestaetigungRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetBestaetigungRichtigkeitAngaben();

} // KinderwunschNachreichung1003Type
