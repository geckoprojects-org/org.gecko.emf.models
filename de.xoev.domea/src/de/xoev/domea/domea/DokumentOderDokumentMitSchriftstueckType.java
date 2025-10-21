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
 * A representation of the model object '<em><b>Dokument Oder Dokument Mit Schriftstueck Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entweder ein Dokument auf unterster Ebene oder ein Dokument mit Schriftstücken.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokument <em>Dokument</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokumentMitSchriftstueck <em>Dokument Mit Schriftstueck</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getDokumentOderDokumentMitSchriftstueckType()
 * @model extendedMetaData="name='DokumentOderDokumentMitSchriftstueckType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DokumentOderDokumentMitSchriftstueckType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Dokument ohne Schriftstücke auf der untersten Ebene der Schriftguthierarchie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dokument</em>' containment reference.
	 * @see #setDokument(DokumentType)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentOderDokumentMitSchriftstueckType_Dokument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dokument' namespace='##targetNamespace'"
	 * @generated
	 */
	DokumentType getDokument();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokument <em>Dokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dokument</em>' containment reference.
	 * @see #getDokument()
	 * @generated
	 */
	void setDokument(DokumentType value);

	/**
	 * Returns the value of the '<em><b>Dokument Mit Schriftstueck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Dokument mit darunterliegenden Schriftstücken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dokument Mit Schriftstueck</em>' containment reference.
	 * @see #setDokumentMitSchriftstueck(DokumentMitSchriftstueckType)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DokumentMitSchriftstueck' namespace='##targetNamespace'"
	 * @generated
	 */
	DokumentMitSchriftstueckType getDokumentMitSchriftstueck();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokumentMitSchriftstueck <em>Dokument Mit Schriftstueck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dokument Mit Schriftstueck</em>' containment reference.
	 * @see #getDokumentMitSchriftstueck()
	 * @generated
	 */
	void setDokumentMitSchriftstueck(DokumentMitSchriftstueckType value);

} // DokumentOderDokumentMitSchriftstueckType
