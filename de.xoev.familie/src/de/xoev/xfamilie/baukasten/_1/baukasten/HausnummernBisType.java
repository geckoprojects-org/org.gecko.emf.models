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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hausnummern Bis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerBis <em>Hausnummer Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerbuchstabezusatzzifferBis <em>Hausnummerbuchstabezusatzziffer Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getTeilnummerderhausnummerBis <em>Teilnummerderhausnummer Bis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getHausnummernBisType()
 * @model extendedMetaData="name='hausnummern.bis_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HausnummernBisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hausnummer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll ein Hausnummernbereich übermittelt werden, so ist hier das Ende dieses Bereichs zu übermitteln. Der Anfang des Bereichs wird in dem Element hausnummer übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummer Bis</em>' attribute.
	 * @see #setHausnummerBis(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getHausnummernBisType_HausnummerBis()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftHausnummerType"
	 *        extendedMetaData="kind='element' name='hausnummer.bis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummerBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerBis <em>Hausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer Bis</em>' attribute.
	 * @see #getHausnummerBis()
	 * @generated
	 */
	void setHausnummerBis(String value);

	/**
	 * Returns the value of the '<em><b>Hausnummerbuchstabezusatzziffer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll ein Hausnummernbereich übermittelt werden, so ist hier das Ende dieses Bereichs zu übermitteln. Der Anfang des Bereichs wird in dem Element hausnummerbuchstabezusatzziffer übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummerbuchstabezusatzziffer Bis</em>' attribute.
	 * @see #setHausnummerbuchstabezusatzzifferBis(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getHausnummernBisType_HausnummerbuchstabezusatzzifferBis()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftHausnummerBuchstabeZusatzzifferType"
	 *        extendedMetaData="kind='element' name='hausnummerbuchstabezusatzziffer.bis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummerbuchstabezusatzzifferBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerbuchstabezusatzzifferBis <em>Hausnummerbuchstabezusatzziffer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummerbuchstabezusatzziffer Bis</em>' attribute.
	 * @see #getHausnummerbuchstabezusatzzifferBis()
	 * @generated
	 */
	void setHausnummerbuchstabezusatzzifferBis(String value);

	/**
	 * Returns the value of the '<em><b>Teilnummerderhausnummer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll ein Hausnummernbereich übermittelt werden, so ist hier das Ende dieses Bereichs zu übermitteln. Der Anfang des Bereichs wird in dem Element teilnummerderhausnummer übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilnummerderhausnummer Bis</em>' attribute.
	 * @see #setTeilnummerderhausnummerBis(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getHausnummernBisType_TeilnummerderhausnummerBis()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftTeilnummerDerHausnummerType"
	 *        extendedMetaData="kind='element' name='teilnummerderhausnummer.bis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTeilnummerderhausnummerBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getTeilnummerderhausnummerBis <em>Teilnummerderhausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teilnummerderhausnummer Bis</em>' attribute.
	 * @see #getTeilnummerderhausnummerBis()
	 * @generated
	 */
	void setTeilnummerderhausnummerBis(String value);

} // HausnummernBisType
