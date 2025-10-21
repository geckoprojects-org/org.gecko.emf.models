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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ausbildung Und Einkuenfte Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung <em>Kind In Ausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getAusbildungsjahr <em>Ausbildungsjahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind <em>Einkuenfte Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getEinkuenfteArt <em>Einkuenfte Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld <em>Kindergeld</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType()
 * @model extendedMetaData="name='AusbildungUndEinkuenfteType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AusbildungUndEinkuenfteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind In Ausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Kind in Ausbildung ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind In Ausbildung</em>' attribute.
	 * @see #isSetKindInAusbildung()
	 * @see #unsetKindInAusbildung()
	 * @see #setKindInAusbildung(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType_KindInAusbildung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kindInAusbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKindInAusbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung <em>Kind In Ausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind In Ausbildung</em>' attribute.
	 * @see #isSetKindInAusbildung()
	 * @see #unsetKindInAusbildung()
	 * @see #isKindInAusbildung()
	 * @generated
	 */
	void setKindInAusbildung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung <em>Kind In Ausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindInAusbildung()
	 * @see #isKindInAusbildung()
	 * @see #setKindInAusbildung(boolean)
	 * @generated
	 */
	void unsetKindInAusbildung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung <em>Kind In Ausbildung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind In Ausbildung</em>' attribute is set.
	 * @see #unsetKindInAusbildung()
	 * @see #isKindInAusbildung()
	 * @see #setKindInAusbildung(boolean)
	 * @generated
	 */
	boolean isSetKindInAusbildung();

	/**
	 * Returns the value of the '<em><b>Ausbildungsjahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verpflichtende Angabe, wenn kindInAusbildung = true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausbildungsjahr</em>' attribute.
	 * @see #setAusbildungsjahr(BigInteger)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType_Ausbildungsjahr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='ausbildungsjahr' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAusbildungsjahr();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getAusbildungsjahr <em>Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausbildungsjahr</em>' attribute.
	 * @see #getAusbildungsjahr()
	 * @generated
	 */
	void setAusbildungsjahr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Einkuenfte Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hat Ihr Kind Einnahmen aus Vermögen (z. B. Miete, Pacht, Zinsen) oder sonstige Einkünfte?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte Kind</em>' attribute.
	 * @see #isSetEinkuenfteKind()
	 * @see #unsetEinkuenfteKind()
	 * @see #setEinkuenfteKind(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType_EinkuenfteKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einkuenfteKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkuenfteKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind <em>Einkuenfte Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkuenfte Kind</em>' attribute.
	 * @see #isSetEinkuenfteKind()
	 * @see #unsetEinkuenfteKind()
	 * @see #isEinkuenfteKind()
	 * @generated
	 */
	void setEinkuenfteKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind <em>Einkuenfte Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkuenfteKind()
	 * @see #isEinkuenfteKind()
	 * @see #setEinkuenfteKind(boolean)
	 * @generated
	 */
	void unsetEinkuenfteKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind <em>Einkuenfte Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkuenfte Kind</em>' attribute is set.
	 * @see #unsetEinkuenfteKind()
	 * @see #isEinkuenfteKind()
	 * @see #setEinkuenfteKind(boolean)
	 * @generated
	 */
	boolean isSetEinkuenfteKind();

	/**
	 * Returns the value of the '<em><b>Einkuenfte Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "einkuenfteArt" wird nur dann eingeblendet, wenn "einkuenfteKind" = true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte Art</em>' attribute.
	 * @see #setEinkuenfteArt(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType_EinkuenfteArt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='einkuenfteArt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEinkuenfteArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getEinkuenfteArt <em>Einkuenfte Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkuenfte Art</em>' attribute.
	 * @see #getEinkuenfteArt()
	 * @generated
	 */
	void setEinkuenfteArt(String value);

	/**
	 * Returns the value of the '<em><b>Kindergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Kindergeld bezogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kindergeld</em>' attribute.
	 * @see #isSetKindergeld()
	 * @see #unsetKindergeld()
	 * @see #setKindergeld(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAusbildungUndEinkuenfteType_Kindergeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='kindergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKindergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld <em>Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindergeld</em>' attribute.
	 * @see #isSetKindergeld()
	 * @see #unsetKindergeld()
	 * @see #isKindergeld()
	 * @generated
	 */
	void setKindergeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld <em>Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindergeld()
	 * @see #isKindergeld()
	 * @see #setKindergeld(boolean)
	 * @generated
	 */
	void unsetKindergeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld <em>Kindergeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kindergeld</em>' attribute is set.
	 * @see #unsetKindergeld()
	 * @see #isKindergeld()
	 * @see #setKindergeld(boolean)
	 * @generated
	 */
	boolean isSetKindergeld();

} // AusbildungUndEinkuenfteType
