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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschaeftsgang Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In einem Geschäftsgang wird das vorgenommene Verwaltungshandeln an Schriftgutobjekten festgehalten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.GeschaeftsgangType#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeschaeftsgangType#getBeteiligungsschritt <em>Beteiligungsschritt</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getGeschaeftsgangType()
 * @model extendedMetaData="name='GeschaeftsgangType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeschaeftsgangType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Identifikation zur systemübergreifend eindeutigen Identifizierung des Geschäftsgangs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation</em>' containment reference.
	 * @see #setIdentifikation(IdentifikationObjektType)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeschaeftsgangType_Identifikation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Identifikation' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationObjektType getIdentifikation();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeschaeftsgangType#getIdentifikation <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation</em>' containment reference.
	 * @see #getIdentifikation()
	 * @generated
	 */
	void setIdentifikation(IdentifikationObjektType value);

	/**
	 * Returns the value of the '<em><b>Beteiligungsschritt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.BeteiligungsschrittType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein dem Geschäftsgang zugeordneter Beteiligungsschritt, der im Zuge des Geschäftsgangs durchgeführt wird. Die Beteiligungsschritte sind fortlaufend nummeriert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beteiligungsschritt</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getGeschaeftsgangType_Beteiligungsschritt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Beteiligungsschritt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BeteiligungsschrittType> getBeteiligungsschritt();

} // GeschaeftsgangType
