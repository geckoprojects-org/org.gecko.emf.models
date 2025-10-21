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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke Type5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGap <em>Pre Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGap <em>Post Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGraphic <em>Pre Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGraphic <em>Post Graphic</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStrokeType5()
 * @model abstract="true"
 *        extendedMetaData="name='StrokeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StrokeType5 extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lücke am Anfang der Linie, Angabe in Einheiten des "mapLengthFactor".
	 * 
	 * Default: Ohne Lücke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Gap</em>' attribute.
	 * @see #isSetPreGap()
	 * @see #unsetPreGap()
	 * @see #setPreGap(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStrokeType5_PreGap()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='preGap' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPreGap();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGap <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Gap</em>' attribute.
	 * @see #isSetPreGap()
	 * @see #unsetPreGap()
	 * @see #getPreGap()
	 * @generated
	 */
	void setPreGap(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGap <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreGap()
	 * @see #getPreGap()
	 * @see #setPreGap(double)
	 * @generated
	 */
	void unsetPreGap();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGap <em>Pre Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Gap</em>' attribute is set.
	 * @see #unsetPreGap()
	 * @see #getPreGap()
	 * @see #setPreGap(double)
	 * @generated
	 */
	boolean isSetPreGap();

	/**
	 * Returns the value of the '<em><b>Post Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lücke am Ende der Linie, Angabe in Einheiten des "mapLengthFactor".
	 * 
	 * Default: Ohne Lücke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Gap</em>' attribute.
	 * @see #isSetPostGap()
	 * @see #unsetPostGap()
	 * @see #setPostGap(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStrokeType5_PostGap()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='postGap' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPostGap();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGap <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Gap</em>' attribute.
	 * @see #isSetPostGap()
	 * @see #unsetPostGap()
	 * @see #getPostGap()
	 * @generated
	 */
	void setPostGap(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGap <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostGap()
	 * @see #getPostGap()
	 * @see #setPostGap(double)
	 * @generated
	 */
	void unsetPostGap();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGap <em>Post Gap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Post Gap</em>' attribute is set.
	 * @see #unsetPostGap()
	 * @see #getPostGap()
	 * @see #setPostGap(double)
	 * @generated
	 */
	boolean isSetPostGap();

	/**
	 * Returns the value of the '<em><b>Pre Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphic am Anfang der Linie. Die relative Drehung des Graphic zur Linie wird über das "zwischengeschaltete" Objekt LinePlacedGraphic gesteuert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Graphic</em>' containment reference.
	 * @see #setPreGraphic(PreGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStrokeType5_PreGraphic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preGraphic' namespace='##targetNamespace'"
	 * @generated
	 */
	PreGraphicType getPreGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPreGraphic <em>Pre Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Graphic</em>' containment reference.
	 * @see #getPreGraphic()
	 * @generated
	 */
	void setPreGraphic(PreGraphicType value);

	/**
	 * Returns the value of the '<em><b>Post Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphic am Ende der Linie. Die relative Drehung des Graphic zur Linie wird über das "zwischengeschaltete" Objekt LinePlacedGraphic gesteuert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Graphic</em>' containment reference.
	 * @see #setPostGraphic(PostGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStrokeType5_PostGraphic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postGraphic' namespace='##targetNamespace'"
	 * @generated
	 */
	PostGraphicType getPostGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5#getPostGraphic <em>Post Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Graphic</em>' containment reference.
	 * @see #getPostGraphic()
	 * @generated
	 */
	void setPostGraphic(PostGraphicType value);

} // StrokeType5
