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
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifikation Objekt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Zusammenfassung von Merkmalen zur eindeutigen Identifizierung eines Schriftgutobjektes (Dokument, Vorgang, Akte) bzw. von Schriftstücken, Geschäftsgängen und zur Nummerierung im übergeordneten Schriftgutobjekt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.IdentifikationObjektType#getXdomeaUUID <em>Xdomea UUID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getIdentifikationObjektType()
 * @model extendedMetaData="name='IdentifikationObjektType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifikationObjektType extends EObject {
	/**
	 * Returns the value of the '<em><b>Xdomea UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jedes Schriftgutobjekt (Dokument, Vorgang, Akte), jedes ggf. im Dokument enthaltene Schriftstück und jeder Geschäftsgang erhält beim Nachrichtenaustausch eine UUID (xdomeaUUID), die sowohl im sendenden als auch empfangenden System als externe ID gespeichert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xdomea UUID</em>' attribute.
	 * @see #setXdomeaUUID(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getIdentifikationObjektType_XdomeaUUID()
	 * @model dataType="basisnachricht.UUID" required="true"
	 *        extendedMetaData="kind='element' name='xdomeaUUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXdomeaUUID();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.IdentifikationObjektType#getXdomeaUUID <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdomea UUID</em>' attribute.
	 * @see #getXdomeaUUID()
	 * @generated
	 */
	void setXdomeaUUID(String value);

	/**
	 * Returns the value of the '<em><b>Nummer Im Uebergeordneten Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die laufende Nummer eines Objekts im übergeordneten Objekt (z. B. die Heftungsnummer eines Dokuments in einem Vorgang, die Nummer eines Vorgangs oder einer Teilakte in einer Akte, die Nummer eines Geschäftsgangs in einem Dokument).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer Im Uebergeordneten Container</em>' attribute.
	 * @see #isSetNummerImUebergeordnetenContainer()
	 * @see #unsetNummerImUebergeordnetenContainer()
	 * @see #setNummerImUebergeordnetenContainer(long)
	 * @see de.xoev.domea.domea.DomeaPackage#getIdentifikationObjektType_NummerImUebergeordnetenContainer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='NummerImUebergeordnetenContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNummerImUebergeordnetenContainer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Im Uebergeordneten Container</em>' attribute.
	 * @see #isSetNummerImUebergeordnetenContainer()
	 * @see #unsetNummerImUebergeordnetenContainer()
	 * @see #getNummerImUebergeordnetenContainer()
	 * @generated
	 */
	void setNummerImUebergeordnetenContainer(long value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNummerImUebergeordnetenContainer()
	 * @see #getNummerImUebergeordnetenContainer()
	 * @see #setNummerImUebergeordnetenContainer(long)
	 * @generated
	 */
	void unsetNummerImUebergeordnetenContainer();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nummer Im Uebergeordneten Container</em>' attribute is set.
	 * @see #unsetNummerImUebergeordnetenContainer()
	 * @see #getNummerImUebergeordnetenContainer()
	 * @see #setNummerImUebergeordnetenContainer(long)
	 * @generated
	 */
	boolean isSetNummerImUebergeordnetenContainer();

} // IdentifikationObjektType
