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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragdetails Unfallversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weitere Angaben zur Beantragung von Zuschüssen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getBeantragungKostenUnfallversicherung <em>Beantragung Kosten Unfallversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getZuschuesse <em>Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsUnfallversicherungType()
 * @model extendedMetaData="name='AntragdetailsUnfallversicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragdetailsUnfallversicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beantragung Kosten Unfallversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit beantrage ich/beantragen wir die Bezuschussung/Übernahme der Kosten meiner/unserer privaten Unfallversicherung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beantragung Kosten Unfallversicherung</em>' attribute.
	 * @see #setBeantragungKostenUnfallversicherung(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsUnfallversicherungType_BeantragungKostenUnfallversicherung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='beantragungKostenUnfallversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeantragungKostenUnfallversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getBeantragungKostenUnfallversicherung <em>Beantragung Kosten Unfallversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beantragung Kosten Unfallversicherung</em>' attribute.
	 * @see #getBeantragungKostenUnfallversicherung()
	 * @generated
	 */
	void setBeantragungKostenUnfallversicherung(String value);

	/**
	 * Returns the value of the '<em><b>Zuschuesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich erhalte/Wir erhalten keine Zuschüsse/Zuschüsse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zuschuesse</em>' containment reference.
	 * @see #setZuschuesse(CodeZuschuesseType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsUnfallversicherungType_Zuschuesse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zuschuesse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeZuschuesseType getZuschuesse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getZuschuesse <em>Zuschuesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zuschuesse</em>' containment reference.
	 * @see #getZuschuesse()
	 * @generated
	 */
	void setZuschuesse(CodeZuschuesseType value);

	/**
	 * Returns the value of the '<em><b>Hoehe Zuschuesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuschüsse in Höhe von
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Zuschuesse</em>' attribute.
	 * @see #isSetHoeheZuschuesse()
	 * @see #unsetHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsUnfallversicherungType_HoeheZuschuesse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='hoeheZuschuesse' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHoeheZuschuesse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Zuschuesse</em>' attribute.
	 * @see #isSetHoeheZuschuesse()
	 * @see #unsetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @generated
	 */
	void setHoeheZuschuesse(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @generated
	 */
	void unsetHoeheZuschuesse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hoehe Zuschuesse</em>' attribute is set.
	 * @see #unsetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @generated
	 */
	boolean isSetHoeheZuschuesse();

} // AntragdetailsUnfallversicherungType
