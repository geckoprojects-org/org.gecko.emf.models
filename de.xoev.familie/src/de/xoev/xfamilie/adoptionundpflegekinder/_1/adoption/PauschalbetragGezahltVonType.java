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
 * A representation of the model object '<em><b>Pauschalbetrag Gezahlt Von Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu Stadt, Bezirk/Stadtteil und Aktenzeichen der wirtschaftlichen Jugendhilfe
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getStadt <em>Stadt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getBezirkStadtteil <em>Bezirk Stadtteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getAktenzeichenWirtschaftlicheJugendhilfe <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPauschalbetragGezahltVonType()
 * @model extendedMetaData="name='PauschalbetragGezahltVonType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PauschalbetragGezahltVonType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stadt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stadt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stadt</em>' attribute.
	 * @see #setStadt(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPauschalbetragGezahltVonType_Stadt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='stadt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStadt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getStadt <em>Stadt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadt</em>' attribute.
	 * @see #getStadt()
	 * @generated
	 */
	void setStadt(String value);

	/**
	 * Returns the value of the '<em><b>Bezirk Stadtteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezirk/Stadtteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezirk Stadtteil</em>' attribute.
	 * @see #setBezirkStadtteil(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPauschalbetragGezahltVonType_BezirkStadtteil()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bezirkStadtteil' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezirkStadtteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getBezirkStadtteil <em>Bezirk Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezirk Stadtteil</em>' attribute.
	 * @see #getBezirkStadtteil()
	 * @generated
	 */
	void setBezirkStadtteil(String value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen Wirtschaftliche Jugendhilfe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktenzeichen der wirtschaftlichen Jugendhilfe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>' attribute.
	 * @see #setAktenzeichenWirtschaftlicheJugendhilfe(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPauschalbetragGezahltVonType_AktenzeichenWirtschaftlicheJugendhilfe()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichenWirtschaftlicheJugendhilfe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenWirtschaftlicheJugendhilfe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragGezahltVonType#getAktenzeichenWirtschaftlicheJugendhilfe <em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen Wirtschaftliche Jugendhilfe</em>' attribute.
	 * @see #getAktenzeichenWirtschaftlicheJugendhilfe()
	 * @generated
	 */
	void setAktenzeichenWirtschaftlicheJugendhilfe(String value);

} // PauschalbetragGezahltVonType
