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
 * A representation of the model object '<em><b>Zusatzparametergruppe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z.B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in XFamilie spezifizierten Metadaten nicht möglich ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeld <em>Feld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeldgruppe <em>Feldgruppe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFassungHandlungsanweisung <em>Fassung Handlungsanweisung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZusatzparametergruppeType()
 * @model extendedMetaData="name='ZusatzparametergruppeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZusatzparametergruppeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Feld, das der Zusatzparametergruppe zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feld</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZusatzparametergruppeType_Feld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldType> getFeld();

	/**
	 * Returns the value of the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Feldgruppe, die der Zusatzparametergruppe zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feldgruppe</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZusatzparametergruppeType_Feldgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feldgruppe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldgruppeType> getFeldgruppe();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name der Zusatzparametergruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZusatzparametergruppeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fassung Handlungsanweisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Fassungsdatum der zugehörigen Handlungsanweisung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fassung Handlungsanweisung</em>' attribute.
	 * @see #setFassungHandlungsanweisung(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZusatzparametergruppeType_FassungHandlungsanweisung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='fassungHandlungsanweisung' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFassungHandlungsanweisung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFassungHandlungsanweisung <em>Fassung Handlungsanweisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fassung Handlungsanweisung</em>' attribute.
	 * @see #getFassungHandlungsanweisung()
	 * @generated
	 */
	void setFassungHandlungsanweisung(XMLGregorianCalendar value);

} // ZusatzparametergruppeType
