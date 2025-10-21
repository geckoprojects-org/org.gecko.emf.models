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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staatsangehoerigkeiten Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStaatsangehoerigkeitenNachweisbezugType()
 * @model extendedMetaData="name='Staatsangehoerigkeiten.NachweisbezugType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatsangehoerigkeitenNachweisbezugType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Staatsangehörigkeit einer Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeStaatsangehoerigkeitType> getStaatsangehoerigkeit();

	/**
	 * Returns the value of the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #setNachweisbezug(NachweisbezugType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisbezug' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisbezugType getNachweisbezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #getNachweisbezug()
	 * @generated
	 */
	void setNachweisbezug(NachweisbezugType value);

} // StaatsangehoerigkeitenNachweisbezugType
