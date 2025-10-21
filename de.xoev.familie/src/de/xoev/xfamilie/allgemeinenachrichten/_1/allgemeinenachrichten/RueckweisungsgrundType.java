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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rueckweisungsgrund Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrund <em>Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrundSpezifisch <em>Grund Spezifisch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundType()
 * @model extendedMetaData="name='RueckweisungsgrundType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RueckweisungsgrundType extends EObject {
	/**
	 * Returns the value of the '<em><b>Grund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird ein Grund übermittelt, aus dem die Nachricht zurückgewiesen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grund</em>' containment reference.
	 * @see #setGrund(CodeRueckweisungsgrundType)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundType_Grund()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='grund' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeRueckweisungsgrundType getGrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrund <em>Grund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grund</em>' containment reference.
	 * @see #getGrund()
	 * @generated
	 */
	void setGrund(CodeRueckweisungsgrundType value);

	/**
	 * Returns the value of the '<em><b>Grund Spezifisch</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element können weitere - im Allgemeinen kontextspezifische Angaben - zu dem Grund übermittelt werden, aus dem die Nachricht zurückgewiesen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grund Spezifisch</em>' containment reference list.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getRueckweisungsgrundType_GrundSpezifisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grundSpezifisch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RueckweisungsgrundSpezifischType> getGrundSpezifisch();

} // RueckweisungsgrundType
