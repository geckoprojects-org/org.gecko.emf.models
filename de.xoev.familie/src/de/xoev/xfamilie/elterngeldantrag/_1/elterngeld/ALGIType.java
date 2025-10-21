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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALGI Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Bezug von Arbeitslosengeld I (ALG I).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getZeitraumALGI <em>Zeitraum ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#getNachweisALGI <em>Nachweis ALGI</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getALGIType()
 * @model extendedMetaData="name='ALGIType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ALGIType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug ALGI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ALG I bezogen wird/wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug ALGI</em>' attribute.
	 * @see #isSetBezugALGI()
	 * @see #unsetBezugALGI()
	 * @see #setBezugALGI(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getALGIType_BezugALGI()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugALGI' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugALGI();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI <em>Bezug ALGI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug ALGI</em>' attribute.
	 * @see #isSetBezugALGI()
	 * @see #unsetBezugALGI()
	 * @see #isBezugALGI()
	 * @generated
	 */
	void setBezugALGI(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI <em>Bezug ALGI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugALGI()
	 * @see #isBezugALGI()
	 * @see #setBezugALGI(boolean)
	 * @generated
	 */
	void unsetBezugALGI();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType#isBezugALGI <em>Bezug ALGI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug ALGI</em>' attribute is set.
	 * @see #unsetBezugALGI()
	 * @see #isBezugALGI()
	 * @see #setBezugALGI(boolean)
	 * @generated
	 */
	boolean isSetBezugALGI();

	/**
	 * Returns the value of the '<em><b>Zeitraum ALGI</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitraum des Bezuges von ALG I.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum ALGI</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getALGIType_ZeitraumALGI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumALGI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumALGI();

	/**
	 * Returns the value of the '<em><b>Nachweis ALGI</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Möglichkeit, Nachweise über den Bezug von ALG I zu übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis ALGI</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getALGIType_NachweisALGI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisALGI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisALGI();

} // ALGIType
