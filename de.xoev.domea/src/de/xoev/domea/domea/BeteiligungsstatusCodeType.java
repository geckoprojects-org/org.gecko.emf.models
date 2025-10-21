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

import code.Code;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beteiligungsstatus Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Datentyp zur Werteliste von Beteiligungsstatus unter Angabe weiterer Informationen zur konkreten Angabe eines Wertes. Für die Umsetzung in den Systemen wird empfohlen, sofern kein anderer Wert hinterlegt wurde, als Standardwert den Wert "001" für "Der Schritt liegt in der Zukunft." anzugeben.
 * <!-- end-model-doc -->
 *
 *
 * @see de.xoev.domea.domea.DomeaPackage#getBeteiligungsstatusCodeType()
 * @model extendedMetaData="name='BeteiligungsstatusCodeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeteiligungsstatusCodeType extends Code {
} // BeteiligungsstatusCodeType
