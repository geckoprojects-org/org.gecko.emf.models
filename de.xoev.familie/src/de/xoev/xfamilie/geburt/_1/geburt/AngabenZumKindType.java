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
package de.xoev.xfamilie.geburt._1.geburt;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Kind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getNachgeburtlicheAngabenZumKind <em>Nachgeburtliche Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getAngabenZumKindVorGeburt <em>Angaben Zum Kind Vor Geburt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumKindType()
 * @model extendedMetaData="name='AngabenZumKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZumKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachgeburtliche Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachgeburtliche Angaben zum Kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachgeburtliche Angaben Zum Kind</em>' containment reference.
	 * @see #setNachgeburtlicheAngabenZumKind(NachgeburtlicheAngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumKindType_NachgeburtlicheAngabenZumKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachgeburtlicheAngabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	NachgeburtlicheAngabenZumKindType getNachgeburtlicheAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getNachgeburtlicheAngabenZumKind <em>Nachgeburtliche Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachgeburtliche Angaben Zum Kind</em>' containment reference.
	 * @see #getNachgeburtlicheAngabenZumKind()
	 * @generated
	 */
	void setNachgeburtlicheAngabenZumKind(NachgeburtlicheAngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind Vor Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgeburtliche Angaben zum Kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind Vor Geburt</em>' containment reference.
	 * @see #setAngabenZumKindVorGeburt(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumKindType_AngabenZumKindVorGeburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZumKindVorGeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getAngabenZumKindVorGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getAngabenZumKindVorGeburt <em>Angaben Zum Kind Vor Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind Vor Geburt</em>' containment reference.
	 * @see #getAngabenZumKindVorGeburt()
	 * @generated
	 */
	void setAngabenZumKindVorGeburt(TeilbekanntesDatumType value);

} // AngabenZumKindType
