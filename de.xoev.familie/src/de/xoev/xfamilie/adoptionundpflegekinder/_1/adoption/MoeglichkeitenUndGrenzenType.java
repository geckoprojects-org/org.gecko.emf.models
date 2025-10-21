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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moeglichkeiten Und Grenzen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu Möglichkeiten und Genzen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#getZutrauenKindAltersangabe <em>Zutrauen Kind Altersangabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType()
 * @model extendedMetaData="name='MoeglichkeitenUndGrenzenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MoeglichkeitenUndGrenzenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Jeden Alters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu, ein Kind jeden Alters aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Jeden Alters</em>' attribute.
	 * @see #isSetZutrauenKindJedenAlters()
	 * @see #unsetZutrauenKindJedenAlters()
	 * @see #setZutrauenKindJedenAlters(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindJedenAlters()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zutrauenKindJedenAlters' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZutrauenKindJedenAlters();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Jeden Alters</em>' attribute.
	 * @see #isSetZutrauenKindJedenAlters()
	 * @see #unsetZutrauenKindJedenAlters()
	 * @see #isZutrauenKindJedenAlters()
	 * @generated
	 */
	void setZutrauenKindJedenAlters(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZutrauenKindJedenAlters()
	 * @see #isZutrauenKindJedenAlters()
	 * @see #setZutrauenKindJedenAlters(boolean)
	 * @generated
	 */
	void unsetZutrauenKindJedenAlters();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zutrauen Kind Jeden Alters</em>' attribute is set.
	 * @see #unsetZutrauenKindJedenAlters()
	 * @see #isZutrauenKindJedenAlters()
	 * @see #setZutrauenKindJedenAlters(boolean)
	 * @generated
	 */
	boolean isSetZutrauenKindJedenAlters();

	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Altersangabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu ein Kind im Alter von ... bis ... Aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Altersangabe</em>' attribute.
	 * @see #setZutrauenKindAltersangabe(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindAltersangabe()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zutrauenKindAltersangabe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZutrauenKindAltersangabe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#getZutrauenKindAltersangabe <em>Zutrauen Kind Altersangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Altersangabe</em>' attribute.
	 * @see #getZutrauenKindAltersangabe()
	 * @generated
	 */
	void setZutrauenKindAltersangabe(String value);

	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu, ein Kind mit einer Beeinträchtigung aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindBeeintraechtigung()
	 * @see #unsetZutrauenKindBeeintraechtigung()
	 * @see #setZutrauenKindBeeintraechtigung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindBeeintraechtigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zutrauenKindBeeintraechtigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZutrauenKindBeeintraechtigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindBeeintraechtigung()
	 * @see #unsetZutrauenKindBeeintraechtigung()
	 * @see #isZutrauenKindBeeintraechtigung()
	 * @generated
	 */
	void setZutrauenKindBeeintraechtigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZutrauenKindBeeintraechtigung()
	 * @see #isZutrauenKindBeeintraechtigung()
	 * @see #setZutrauenKindBeeintraechtigung(boolean)
	 * @generated
	 */
	void unsetZutrauenKindBeeintraechtigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zutrauen Kind Beeintraechtigung</em>' attribute is set.
	 * @see #unsetZutrauenKindBeeintraechtigung()
	 * @see #isZutrauenKindBeeintraechtigung()
	 * @see #setZutrauenKindBeeintraechtigung(boolean)
	 * @generated
	 */
	boolean isSetZutrauenKindBeeintraechtigung();

	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Koerperliche Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu, ein Kind mit körperlicher Beeinträchtigung aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Koerperliche Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #unsetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #setZutrauenKindKoerperlicheBeeintraechtigung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindKoerperlicheBeeintraechtigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zutrauenKindKoerperlicheBeeintraechtigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZutrauenKindKoerperlicheBeeintraechtigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Koerperliche Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #unsetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @generated
	 */
	void setZutrauenKindKoerperlicheBeeintraechtigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #setZutrauenKindKoerperlicheBeeintraechtigung(boolean)
	 * @generated
	 */
	void unsetZutrauenKindKoerperlicheBeeintraechtigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zutrauen Kind Koerperliche Beeintraechtigung</em>' attribute is set.
	 * @see #unsetZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @see #setZutrauenKindKoerperlicheBeeintraechtigung(boolean)
	 * @generated
	 */
	boolean isSetZutrauenKindKoerperlicheBeeintraechtigung();

	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Geistiger Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu, ein Kind mit geistiger Beeinträchtigung aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Geistiger Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #unsetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #setZutrauenKindGeistigerBeeintraechtigung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindGeistigerBeeintraechtigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zutrauenKindGeistigerBeeintraechtigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZutrauenKindGeistigerBeeintraechtigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Geistiger Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #unsetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #isZutrauenKindGeistigerBeeintraechtigung()
	 * @generated
	 */
	void setZutrauenKindGeistigerBeeintraechtigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #isZutrauenKindGeistigerBeeintraechtigung()
	 * @see #setZutrauenKindGeistigerBeeintraechtigung(boolean)
	 * @generated
	 */
	void unsetZutrauenKindGeistigerBeeintraechtigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zutrauen Kind Geistiger Beeintraechtigung</em>' attribute is set.
	 * @see #unsetZutrauenKindGeistigerBeeintraechtigung()
	 * @see #isZutrauenKindGeistigerBeeintraechtigung()
	 * @see #setZutrauenKindGeistigerBeeintraechtigung(boolean)
	 * @generated
	 */
	boolean isSetZutrauenKindGeistigerBeeintraechtigung();

	/**
	 * Returns the value of the '<em><b>Zutrauen Kind Psychischer Beeintraechtigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich traue mir/ Wir trauen uns zu, ein Kind mit seelischer oder psychischer Beeinträchtigung aufzunehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zutrauen Kind Psychischer Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #unsetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #setZutrauenKindPsychischerBeeintraechtigung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getMoeglichkeitenUndGrenzenType_ZutrauenKindPsychischerBeeintraechtigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zutrauenKindPsychischerBeeintraechtigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZutrauenKindPsychischerBeeintraechtigung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zutrauen Kind Psychischer Beeintraechtigung</em>' attribute.
	 * @see #isSetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #unsetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #isZutrauenKindPsychischerBeeintraechtigung()
	 * @generated
	 */
	void setZutrauenKindPsychischerBeeintraechtigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #isZutrauenKindPsychischerBeeintraechtigung()
	 * @see #setZutrauenKindPsychischerBeeintraechtigung(boolean)
	 * @generated
	 */
	void unsetZutrauenKindPsychischerBeeintraechtigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zutrauen Kind Psychischer Beeintraechtigung</em>' attribute is set.
	 * @see #unsetZutrauenKindPsychischerBeeintraechtigung()
	 * @see #isZutrauenKindPsychischerBeeintraechtigung()
	 * @see #setZutrauenKindPsychischerBeeintraechtigung(boolean)
	 * @generated
	 */
	boolean isSetZutrauenKindPsychischerBeeintraechtigung();

} // MoeglichkeitenUndGrenzenType
