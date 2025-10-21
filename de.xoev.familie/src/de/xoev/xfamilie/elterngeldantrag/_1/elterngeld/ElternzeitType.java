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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elternzeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben des Zeitraums der geplanten Elternzeit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumVon <em>Zeitraum Von</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumBis <em>Zeitraum Bis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternzeitType()
 * @model extendedMetaData="name='ElternzeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElternzeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zeitraum Von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn des Zeitraums der Elternzeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Von</em>' attribute.
	 * @see #setZeitraumVon(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternzeitType_ZeitraumVon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='zeitraumVon' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraumVon();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumVon <em>Zeitraum Von</em>}' attribute.
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
	 * Ende des Zeitraums der Elternzeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Bis</em>' attribute.
	 * @see #setZeitraumBis(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElternzeitType_ZeitraumBis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='zeitraumBis' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraumBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType#getZeitraumBis <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum Bis</em>' attribute.
	 * @see #getZeitraumBis()
	 * @generated
	 */
	void setZeitraumBis(XMLGregorianCalendar value);

} // ElternzeitType
