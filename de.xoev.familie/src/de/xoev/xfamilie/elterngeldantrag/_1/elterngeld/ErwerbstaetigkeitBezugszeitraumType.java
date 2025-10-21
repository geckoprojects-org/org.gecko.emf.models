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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erwerbstaetigkeit Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe, ob die antragstellende Person im Bezugszeitraum einer beruflichen Tätigkeit nachgeht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getResturlaub <em>Resturlaub</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getTagespflege <em>Tagespflege</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getErwerbstaetigkeitBezugszeitraumType()
 * @model extendedMetaData="name='ErwerbstaetigkeitBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErwerbstaetigkeitBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person im Bezugszeitraum einer beruflichen Tätigkeit nachgeht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>' attribute.
	 * @see #isSetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #unsetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #setEinkuenfteErwerbstaetigkeitBezugszeitraum(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getErwerbstaetigkeitBezugszeitraumType_EinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einkuenfteErwerbstaetigkeitBezugszeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkuenfteErwerbstaetigkeitBezugszeitraum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>' attribute.
	 * @see #isSetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #unsetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @generated
	 */
	void setEinkuenfteErwerbstaetigkeitBezugszeitraum(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #setEinkuenfteErwerbstaetigkeitBezugszeitraum(boolean)
	 * @generated
	 */
	void unsetEinkuenfteErwerbstaetigkeitBezugszeitraum();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#isEinkuenfteErwerbstaetigkeitBezugszeitraum <em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkuenfte Erwerbstaetigkeit Bezugszeitraum</em>' attribute is set.
	 * @see #unsetEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #isEinkuenfteErwerbstaetigkeitBezugszeitraum()
	 * @see #setEinkuenfteErwerbstaetigkeitBezugszeitraum(boolean)
	 * @generated
	 */
	boolean isSetEinkuenfteErwerbstaetigkeitBezugszeitraum();

	/**
	 * Returns the value of the '<em><b>Resturlaub</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Resturlaub aus der Zeit vor der Geburt im Bezugszeitraum genommen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resturlaub</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getErwerbstaetigkeitBezugszeitraumType_Resturlaub()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resturlaub' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResturlaubType> getResturlaub();

	/**
	 * Returns the value of the '<em><b>Berufsbildung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person sich im Bezugszeitraum in Berufsbildung befindet. Voraussichtliches Ende: Datumsangabe des vorraussichtlichen Endes der Berufsbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Berufsbildung</em>' containment reference.
	 * @see #setBerufsbildung(BerufsbildungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getErwerbstaetigkeitBezugszeitraumType_Berufsbildung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='berufsbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	BerufsbildungType getBerufsbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getBerufsbildung <em>Berufsbildung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berufsbildung</em>' containment reference.
	 * @see #getBerufsbildung()
	 * @generated
	 */
	void setBerufsbildung(BerufsbildungType value);

	/**
	 * Returns the value of the '<em><b>Tagespflege</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die antragstellende Person eine Tagespflegeperson ist. Anzahl der Kinder: Anzahl der Kinder, die betreut werden (ohne eigene Kinder).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagespflege</em>' containment reference.
	 * @see #setTagespflege(TagespflegeType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getErwerbstaetigkeitBezugszeitraumType_Tagespflege()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tagespflege' namespace='##targetNamespace'"
	 * @generated
	 */
	TagespflegeType getTagespflege();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType#getTagespflege <em>Tagespflege</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagespflege</em>' containment reference.
	 * @see #getTagespflege()
	 * @generated
	 */
	void setTagespflege(TagespflegeType value);

} // ErwerbstaetigkeitBezugszeitraumType
