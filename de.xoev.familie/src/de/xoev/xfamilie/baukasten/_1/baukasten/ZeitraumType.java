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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Zeitraum kennzeichnet einen Abschnitt auf einem Zeitstrahl durch Angabe von Beginn und/oder Ende.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getBeginn <em>Beginn</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getEnde <em>Ende</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZeitraumType()
 * @model extendedMetaData="name='ZeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Beginn eines Zeitraums beschreibt den Zeitpunkt, ab dem ein Sachverhalt eintritt bzw. rechtskräftig wirksam ist. Der Beginn ist immer Teil der Dauer des Zeitraumes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beginn</em>' attribute.
	 * @see #setBeginn(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZeitraumType_Beginn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='beginn' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginn();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getBeginn <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn</em>' attribute.
	 * @see #getBeginn()
	 * @generated
	 */
	void setBeginn(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Ende eines Zeitraumes beschreibt den Zeitpunkt, ab dem ein Sachverhalt endet bzw. nicht mehr rechtskräftig ist. Das Ende ist Teil der Dauer des Zeitraumes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ende</em>' attribute.
	 * @see #setEnde(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZeitraumType_Ende()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='ende' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnde();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getEnde <em>Ende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ende</em>' attribute.
	 * @see #getEnde()
	 * @generated
	 */
	void setEnde(XMLGregorianCalendar value);

} // ZeitraumType
