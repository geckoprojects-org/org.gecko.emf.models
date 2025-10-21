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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Symbolizers Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1#getSymbolizer <em>Symbolizer</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalSymbolizersType1()
 * @model extendedMetaData="name='AdditionalSymbolizersType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalSymbolizersType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbolizer</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle referiert PureSymbolizer-Objekte und macht sie so zu Elementen des AdditionalSymbolizer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbolizer</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalSymbolizersType1_Symbolizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symbolizer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SymbolizerType2> getSymbolizer();

} // AdditionalSymbolizersType1
