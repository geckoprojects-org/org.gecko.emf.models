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
 * A representation of the model object '<em><b>Nachrichtenkopf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getPostkorbHandle <em>Postkorb Handle</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtenkopfType()
 * @model extendedMetaData="name='NachrichtenkopfType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtenkopfType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtenkopfType_IdentifikationNachricht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

	/**
	 * Returns the value of the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier werden Angaben über den Leser der Nachricht übermittelt. Der Leser ist die Behörde oder andere (öffentliche) Stelle, der die Nachricht zugestellt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leser</em>' containment reference.
	 * @see #setLeser(KommunikationspartnerType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtenkopfType_Leser()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='leser' namespace='##targetNamespace'"
	 * @generated
	 */
	KommunikationspartnerType getLeser();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getLeser <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leser</em>' containment reference.
	 * @see #getLeser()
	 * @generated
	 */
	void setLeser(KommunikationspartnerType value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier werden Angaben über den Autor der Nachricht übermittelt, die es dem Leser ermöglichen mit dem Autor in Verbindung zu treten. Der Autor ist die Behörde oder andere (öffentliche) Stelle, die aufgrund eines Geschäftsvorfalls die Nachricht erstellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autor</em>' containment reference.
	 * @see #setAutor(KommunikationspartnerErreichbarType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtenkopfType_Autor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='autor' namespace='##targetNamespace'"
	 * @generated
	 */
	KommunikationspartnerErreichbarType getAutor();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getAutor <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' containment reference.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(KommunikationspartnerErreichbarType value);

	/**
	 * Returns the value of the '<em><b>Postkorb Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postkorbhandle für die elektronische Bescheidzustellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postkorb Handle</em>' containment reference.
	 * @see #setPostkorbHandle(PostkorbHandleType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtenkopfType_PostkorbHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postkorbHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	PostkorbHandleType getPostkorbHandle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getPostkorbHandle <em>Postkorb Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postkorb Handle</em>' containment reference.
	 * @see #getPostkorbHandle()
	 * @generated
	 */
	void setPostkorbHandle(PostkorbHandleType value);

} // NachrichtenkopfType
