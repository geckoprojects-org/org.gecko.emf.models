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
 * A representation of the model object '<em><b>Allgemeiner Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AllgemeinerName leitet sich von der entsprechenden XÖV-Kernkomponente ab. Er dient der Darstellung von Vor- und Nachnamen und fasst deren gemeinsame Eigenschaften zusammen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AllgemeinerNameType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeinerNameType()
 * @model extendedMetaData="name='AllgemeinerNameType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeinerNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name ist der eigentliche Familien- oder Vorname als Zeichenkette. Nachnamen, z. B. mit Adelstiteln bzw. ausländische Nachnamen werden als ein Name übermittelt und nicht in verschiedene Bestandteile aufgeteilt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeinerNameType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeinerNameType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AllgemeinerNameType
