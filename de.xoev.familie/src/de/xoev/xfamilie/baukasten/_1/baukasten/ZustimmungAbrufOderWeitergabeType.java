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
 * A representation of the model object '<em><b>Zustimmung Abruf Oder Weitergabe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Zustimmung zum Datenabruf liegt vor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getArtDesAbrufsOderWeitergabe <em>Art Des Abrufs Oder Weitergabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getInhalteDesAbrufs <em>Inhalte Des Abrufs</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZustimmungAbrufOderWeitergabeType()
 * @model extendedMetaData="name='ZustimmungAbrufOderWeitergabeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZustimmungAbrufOderWeitergabeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art Des Abrufs Oder Weitergabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Art des Abrufs gibt an mit welcher Entität der Abruf vollzogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Des Abrufs Oder Weitergabe</em>' containment reference.
	 * @see #setArtDesAbrufsOderWeitergabe(CodeArtAbrufType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artDesAbrufsOderWeitergabe' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeArtAbrufType getArtDesAbrufsOderWeitergabe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getArtDesAbrufsOderWeitergabe <em>Art Des Abrufs Oder Weitergabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Des Abrufs Oder Weitergabe</em>' containment reference.
	 * @see #getArtDesAbrufsOderWeitergabe()
	 * @generated
	 */
	void setArtDesAbrufsOderWeitergabe(CodeArtAbrufType value);

	/**
	 * Returns the value of the '<em><b>Zustimmung Abruf Oder Weitergabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustimmung Abruf Oder Weitergabe</em>' attribute.
	 * @see #isSetZustimmungAbrufOderWeitergabe()
	 * @see #unsetZustimmungAbrufOderWeitergabe()
	 * @see #setZustimmungAbrufOderWeitergabe(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungAbrufOderWeitergabe' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungAbrufOderWeitergabe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Abruf Oder Weitergabe</em>' attribute.
	 * @see #isSetZustimmungAbrufOderWeitergabe()
	 * @see #unsetZustimmungAbrufOderWeitergabe()
	 * @see #isZustimmungAbrufOderWeitergabe()
	 * @generated
	 */
	void setZustimmungAbrufOderWeitergabe(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungAbrufOderWeitergabe()
	 * @see #isZustimmungAbrufOderWeitergabe()
	 * @see #setZustimmungAbrufOderWeitergabe(boolean)
	 * @generated
	 */
	void unsetZustimmungAbrufOderWeitergabe();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Abruf Oder Weitergabe</em>' attribute is set.
	 * @see #unsetZustimmungAbrufOderWeitergabe()
	 * @see #isZustimmungAbrufOderWeitergabe()
	 * @see #setZustimmungAbrufOderWeitergabe(boolean)
	 * @generated
	 */
	boolean isSetZustimmungAbrufOderWeitergabe();

	/**
	 * Returns the value of the '<em><b>Inhalte Des Abrufs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier koennen weitere Informationen zu den Inhalten der Daten angegeben werden, die ausgetauscht werden sollen und zu denen Antragstellende ihre Zustimmung gegeben haben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhalte Des Abrufs</em>' attribute.
	 * @see #setInhalteDesAbrufs(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='inhalteDesAbrufs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInhalteDesAbrufs();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getInhalteDesAbrufs <em>Inhalte Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhalte Des Abrufs</em>' attribute.
	 * @see #getInhalteDesAbrufs()
	 * @generated
	 */
	void setInhalteDesAbrufs(String value);

} // ZustimmungAbrufOderWeitergabeType
