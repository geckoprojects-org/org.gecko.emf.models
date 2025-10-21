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
package de.xoev.xfamilie.baukasten._1.baukasten;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entgeltdaten Dsrv Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Ergebnis eines DSRV-Abrufs von Arbeitsgeber-Entgeltdaten über das Verfahren rvBEA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumVon <em>Zeitraum Von</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumBis <em>Zeitraum Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getEntgeltdatenArbeitgeber <em>Entgeltdaten Arbeitgeber</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenDsrvNachweisbezugType()
 * @model extendedMetaData="name='Entgeltdaten.Dsrv.NachweisbezugType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntgeltdatenDsrvNachweisbezugType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #setNachweisbezug(NachweisbezugType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweisbezug' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisbezugType getNachweisbezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #getNachweisbezug()
	 * @generated
	 */
	void setNachweisbezug(NachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Zeitraum Von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn des Zeitraums, für welchen die die Entgeltbescheinigungsdaten von der DSRV abgerufen wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Von</em>' attribute.
	 * @see #setZeitraumVon(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='zeitraumVon' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraumVon();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumVon <em>Zeitraum Von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum Von</em>' attribute.
	 * @see #getZeitraumVon()
	 * @generated
	 */
	void setZeitraumVon(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Zeitraum Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ende des Zeitraums, für welchen die die Entgeltbescheinigungsdaten von der DSRV abgerufen wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Bis</em>' attribute.
	 * @see #setZeitraumBis(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='zeitraumBis' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraumBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumBis <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum Bis</em>' attribute.
	 * @see #getZeitraumBis()
	 * @generated
	 */
	void setZeitraumBis(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Entgeltdaten Arbeitgeber</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entgeltdaten Arbeitgeber</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entgeltdaten.arbeitgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntgeltdatenArbeitgeberDsrvType> getEntgeltdatenArbeitgeber();

} // EntgeltdatenDsrvNachweisbezugType
