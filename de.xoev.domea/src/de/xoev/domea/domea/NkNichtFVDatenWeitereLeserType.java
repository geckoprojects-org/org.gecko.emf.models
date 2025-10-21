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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nk Nicht FV Daten Weitere Leser Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Kopf der Nachricht enthält allgemeine Informationen für den Leser einer Nachricht, bei der es sich nicht um eine Empfangs-/Importnachricht auf eine andere Nachricht handelt und die beliebige Leser besitzen kann.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType#getWeitererLeser <em>Weiterer Leser</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNkNichtFVDatenWeitereLeserType()
 * @model extendedMetaData="name='NkNichtFVDatenWeitereLeserType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NkNichtFVDatenWeitereLeserType extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Weiterer Leser</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KontaktType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein weiterer Leser der Nachricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weiterer Leser</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getNkNichtFVDatenWeitereLeserType_WeitererLeser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeitererLeser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KontaktType> getWeitererLeser();

} // NkNichtFVDatenWeitereLeserType
