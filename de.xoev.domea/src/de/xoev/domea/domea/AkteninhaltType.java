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
 * A representation of the model object '<em><b>Akteninhalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AkteninhaltType#getDokumentOderDokumentMitSchriftstueck <em>Dokument Oder Dokument Mit Schriftstueck</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteninhaltType#getVorgang <em>Vorgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AkteninhaltType#getTeilakte <em>Teilakte</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAkteninhaltType()
 * @model extendedMetaData="name='Akteninhalt_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AkteninhaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dokument Oder Dokument Mit Schriftstueck</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Dokument, das hierarchisch in die Akte eingebunden bzw. der Akte untergeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dokument Oder Dokument Mit Schriftstueck</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteninhaltType_DokumentOderDokumentMitSchriftstueck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DokumentOderDokumentMitSchriftstueck' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DokumentOderDokumentMitSchriftstueckType> getDokumentOderDokumentMitSchriftstueck();

	/**
	 * Returns the value of the '<em><b>Vorgang</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.VorgangType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Vorgang, der hierarchisch in die Akte eingebunden bzw. der Akte untergeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorgang</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteninhaltType_Vorgang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorgang' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VorgangType> getVorgang();

	/**
	 * Returns the value of the '<em><b>Teilakte</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AkteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über eine Teilakte wird eine Akte hierarchisch in eine andere Akte eingebunden bzw. einer anderen Akte untergeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilakte</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAkteninhaltType_Teilakte()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Teilakte' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AkteType> getTeilakte();

} // AkteninhaltType
