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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getLineSpacing <em>Line Spacing</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointLabelType()
 * @model extendedMetaData="name='PointLabelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointLabelType extends LabelType3 {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das rotation-Attribut steuert die Drehung eines PointLabels gegenüber seiner Definition. Die Drehung erfolgt um den Ursprung der Definition und wird im Gegenuhrzeigersinn entsprechend dem "mapAngleFactor" angegeben. Default ist die Angabe im Bogenmaß. 
	 * 
	 * Fehlt das Attribut, so wird 0.0 angenommen.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Drehung (Attribut "drehwinkel"), so überschreibt diese die Angabe im rotation-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointLabelType_Rotation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	boolean isSetRotation();

	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung in X in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100).
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointLabelType_DisplacementX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @generated
	 */
	void setDisplacementX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(double)
	 * @generated
	 */
	void unsetDisplacementX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementX <em>Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement X</em>' attribute is set.
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(double)
	 * @generated
	 */
	boolean isSetDisplacementX();

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung in Y in der durch "mapLengthFactor" vorgegebenen Einheit (Default: mm/100).
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointLabelType_DisplacementY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @generated
	 */
	void setDisplacementY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(double)
	 * @generated
	 */
	void unsetDisplacementY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getDisplacementY <em>Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Y</em>' attribute is set.
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(double)
	 * @generated
	 */
	boolean isSetDisplacementY();

	/**
	 * Returns the value of the '<em><b>Line Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei mehrzeiligen Texten zusätzlicher Abstand zwischen den Zeilen in der durch "mapCharSizeFactor" vorgegebenen Einheit (Default: 0,35277777777778mm=1DTP-Punkt). 
	 * 
	 * Default ist 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Spacing</em>' attribute.
	 * @see #isSetLineSpacing()
	 * @see #unsetLineSpacing()
	 * @see #setLineSpacing(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPointLabelType_LineSpacing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='lineSpacing' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLineSpacing();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getLineSpacing <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Spacing</em>' attribute.
	 * @see #isSetLineSpacing()
	 * @see #unsetLineSpacing()
	 * @see #getLineSpacing()
	 * @generated
	 */
	void setLineSpacing(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getLineSpacing <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineSpacing()
	 * @see #getLineSpacing()
	 * @see #setLineSpacing(double)
	 * @generated
	 */
	void unsetLineSpacing();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType#getLineSpacing <em>Line Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Spacing</em>' attribute is set.
	 * @see #unsetLineSpacing()
	 * @see #getLineSpacing()
	 * @see #setLineSpacing(double)
	 * @generated
	 */
	boolean isSetLineSpacing();

} // PointLabelType
