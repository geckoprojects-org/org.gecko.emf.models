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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise Datenschutz Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2 <em>Zustimmung ET2</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseDatenschutzType()
 * @model extendedMetaData="name='NachweiseDatenschutzType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseDatenschutzType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseDatenschutzType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisType> getNachweis();

	/**
	 * Returns the value of the '<em><b>Zustimmung ET2</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zustimmung der Sorgeberechtigten. Hiermit bestätige ich, dass beide sorgeberechtigten Elternteile der Beantragung der Leitung zustimmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung ET2</em>' attribute.
	 * @see #isSetZustimmungET2()
	 * @see #unsetZustimmungET2()
	 * @see #setZustimmungET2(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseDatenschutzType_ZustimmungET2()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zustimmungET2' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungET2();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2 <em>Zustimmung ET2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung ET2</em>' attribute.
	 * @see #isSetZustimmungET2()
	 * @see #unsetZustimmungET2()
	 * @see #isZustimmungET2()
	 * @generated
	 */
	void setZustimmungET2(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2 <em>Zustimmung ET2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungET2()
	 * @see #isZustimmungET2()
	 * @see #setZustimmungET2(boolean)
	 * @generated
	 */
	void unsetZustimmungET2();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2 <em>Zustimmung ET2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung ET2</em>' attribute is set.
	 * @see #unsetZustimmungET2()
	 * @see #isZustimmungET2()
	 * @see #setZustimmungET2(boolean)
	 * @generated
	 */
	boolean isSetZustimmungET2();

	/**
	 * Returns the value of the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseDatenschutzType_RichtigkeitAngaben()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='richtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 */
	void setRichtigkeitAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetRichtigkeitAngaben();

} // NachweiseDatenschutzType
