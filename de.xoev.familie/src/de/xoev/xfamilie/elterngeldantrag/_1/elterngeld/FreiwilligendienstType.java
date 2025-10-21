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
 * A representation of the model object '<em><b>Freiwilligendienst Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getFreiwilligendienstType()
 * @model extendedMetaData="name='FreiwilligendienstType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FreiwilligendienstType extends EObject {
	/**
	 * Returns the value of the '<em><b>Freiwilligendienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freiwilligendienst</em>' attribute.
	 * @see #isSetFreiwilligendienst()
	 * @see #unsetFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getFreiwilligendienstType_Freiwilligendienst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='freiwilligendienst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFreiwilligendienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freiwilligendienst</em>' attribute.
	 * @see #isSetFreiwilligendienst()
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @generated
	 */
	void setFreiwilligendienst(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	void unsetFreiwilligendienst();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#isFreiwilligendienst <em>Freiwilligendienst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freiwilligendienst</em>' attribute is set.
	 * @see #unsetFreiwilligendienst()
	 * @see #isFreiwilligendienst()
	 * @see #setFreiwilligendienst(boolean)
	 * @generated
	 */
	boolean isSetFreiwilligendienst();

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum</em>' attribute.
	 * @see #setZeitraum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getFreiwilligendienstType_Zeitraum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getZeitraum <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitraum</em>' attribute.
	 * @see #getZeitraum()
	 * @generated
	 */
	void setZeitraum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Wochenstunden Je Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wochenstunden Je Taetigkeit</em>' attribute.
	 * @see #setWochenstundenJeTaetigkeit(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getFreiwilligendienstType_WochenstundenJeTaetigkeit()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='wochenstundenJeTaetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWochenstundenJeTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wochenstunden Je Taetigkeit</em>' attribute.
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 */
	void setWochenstundenJeTaetigkeit(String value);

} // FreiwilligendienstType
