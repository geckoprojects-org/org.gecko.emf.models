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
 * A representation of the model object '<em><b>Buergergeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Bezug und zum Beginn und Ende des Bezugs von ALGII/ Bürgergeld.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld <em>Bezug Buergergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getBeginnZeitraumBuergergeld <em>Beginn Zeitraum Buergergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getEndeZeitraumBuergergeld <em>Ende Zeitraum Buergergeld</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBuergergeldType()
 * @model extendedMetaData="name='BuergergeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BuergergeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Bezug von ALGII/ Bürgergeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug Buergergeld</em>' attribute.
	 * @see #isSetBezugBuergergeld()
	 * @see #unsetBezugBuergergeld()
	 * @see #setBezugBuergergeld(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBuergergeldType_BezugBuergergeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugBuergergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugBuergergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld <em>Bezug Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Buergergeld</em>' attribute.
	 * @see #isSetBezugBuergergeld()
	 * @see #unsetBezugBuergergeld()
	 * @see #isBezugBuergergeld()
	 * @generated
	 */
	void setBezugBuergergeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld <em>Bezug Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugBuergergeld()
	 * @see #isBezugBuergergeld()
	 * @see #setBezugBuergergeld(boolean)
	 * @generated
	 */
	void unsetBezugBuergergeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#isBezugBuergergeld <em>Bezug Buergergeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Buergergeld</em>' attribute is set.
	 * @see #unsetBezugBuergergeld()
	 * @see #isBezugBuergergeld()
	 * @see #setBezugBuergergeld(boolean)
	 * @generated
	 */
	boolean isSetBezugBuergergeld();

	/**
	 * Returns the value of the '<em><b>Beginn Zeitraum Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Beginn des Bezugs von ALGII/ Bürgergeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beginn Zeitraum Buergergeld</em>' attribute.
	 * @see #setBeginnZeitraumBuergergeld(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBuergergeldType_BeginnZeitraumBuergergeld()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='beginnZeitraumBuergergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginnZeitraumBuergergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getBeginnZeitraumBuergergeld <em>Beginn Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn Zeitraum Buergergeld</em>' attribute.
	 * @see #getBeginnZeitraumBuergergeld()
	 * @generated
	 */
	void setBeginnZeitraumBuergergeld(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ende Zeitraum Buergergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Ende des Bezugs von ALGII/ Bürgergeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ende Zeitraum Buergergeld</em>' attribute.
	 * @see #setEndeZeitraumBuergergeld(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBuergergeldType_EndeZeitraumBuergergeld()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='endeZeitraumBuergergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndeZeitraumBuergergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType#getEndeZeitraumBuergergeld <em>Ende Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ende Zeitraum Buergergeld</em>' attribute.
	 * @see #getEndeZeitraumBuergergeld()
	 * @generated
	 */
	void setEndeZeitraumBuergergeld(XMLGregorianCalendar value);

} // BuergergeldType
