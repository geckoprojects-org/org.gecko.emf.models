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
 * A representation of the model object '<em><b>Dokument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu einem Dokument ohne Schriftstücke auf der untersten Ebene der Schriftguthierarchie.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.DokumentType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getDokumentType()
 * @model extendedMetaData="name='DokumentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DokumentType extends DokumentSchriftstueckBasisType {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.VersionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über eine Version wird ein bestimmter Bearbeitungszustand zu einem Dokument im Rahmen der Versionierung des Dokumentes abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentType_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionType> getVersion();

} // DokumentType
