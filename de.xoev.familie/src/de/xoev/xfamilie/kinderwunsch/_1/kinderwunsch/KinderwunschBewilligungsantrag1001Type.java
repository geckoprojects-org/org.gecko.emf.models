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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bewilligungsantrag1001 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type#getBewilligungsantrag <em>Bewilligungsantrag</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschBewilligungsantrag1001Type()
 * @model extendedMetaData="name='kinderwunsch.bewilligungsantrag.1001_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KinderwunschBewilligungsantrag1001Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Bewilligungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bewilligungsantrag</em>' containment reference.
	 * @see #setBewilligungsantrag(BewilligungsantragType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bewilligungsantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	BewilligungsantragType getBewilligungsantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type#getBewilligungsantrag <em>Bewilligungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bewilligungsantrag</em>' containment reference.
	 * @see #getBewilligungsantrag()
	 * @generated
	 */
	void setBewilligungsantrag(BewilligungsantragType value);

} // KinderwunschBewilligungsantrag1001Type
