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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wohnsitz Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getAnschriftInlandStrassenanschrift <em>Anschrift Inland Strassenanschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getWohnsitzType()
 * @model extendedMetaData="name='WohnsitzType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WohnsitzType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anschrift Inland Strassenanschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift Inland Strassenanschrift</em>' containment reference.
	 * @see #setAnschriftInlandStrassenanschrift(MeldeanschriftType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getWohnsitzType_AnschriftInlandStrassenanschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschriftInlandStrassenanschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	MeldeanschriftType getAnschriftInlandStrassenanschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getAnschriftInlandStrassenanschrift <em>Anschrift Inland Strassenanschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Inland Strassenanschrift</em>' containment reference.
	 * @see #getAnschriftInlandStrassenanschrift()
	 * @generated
	 */
	void setAnschriftInlandStrassenanschrift(MeldeanschriftType value);

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse NPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abweichende Adresse NPA</em>' attribute.
	 * @see #isSetAbweichendeAdresseNPA()
	 * @see #unsetAbweichendeAdresseNPA()
	 * @see #setAbweichendeAdresseNPA(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getWohnsitzType_AbweichendeAdresseNPA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='abweichendeAdresseNPA' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbweichendeAdresseNPA();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse NPA</em>' attribute.
	 * @see #isSetAbweichendeAdresseNPA()
	 * @see #unsetAbweichendeAdresseNPA()
	 * @see #isAbweichendeAdresseNPA()
	 * @generated
	 */
	void setAbweichendeAdresseNPA(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbweichendeAdresseNPA()
	 * @see #isAbweichendeAdresseNPA()
	 * @see #setAbweichendeAdresseNPA(boolean)
	 * @generated
	 */
	void unsetAbweichendeAdresseNPA();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abweichende Adresse NPA</em>' attribute is set.
	 * @see #unsetAbweichendeAdresseNPA()
	 * @see #isAbweichendeAdresseNPA()
	 * @see #setAbweichendeAdresseNPA(boolean)
	 * @generated
	 */
	boolean isSetAbweichendeAdresseNPA();

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference.
	 * @see #setErreichbarkeit(ErreichbarkeitType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getWohnsitzType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	ErreichbarkeitType getErreichbarkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getErreichbarkeit <em>Erreichbarkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erreichbarkeit</em>' containment reference.
	 * @see #getErreichbarkeit()
	 * @generated
	 */
	void setErreichbarkeit(ErreichbarkeitType value);

} // WohnsitzType
