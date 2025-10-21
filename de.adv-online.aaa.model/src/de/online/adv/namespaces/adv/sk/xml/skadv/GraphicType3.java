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
 * A representation of the model object '<em><b>Graphic Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getScalefactor <em>Scalefactor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getHalo <em>Halo</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3()
 * @model abstract="true"
 *        extendedMetaData="name='GraphicType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GraphicType3 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung eines Graphic in X-Richtung. 
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3_DisplacementX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementX <em>Displacement X</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(double)
	 * @generated
	 */
	void unsetDisplacementX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementX <em>Displacement X</em>}' attribute is set.
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
	 * Verschiebung eines Graphic in Y-Richtung, 
	 * 
	 * Die Einheit wird bestimmt durch den mapLengthFactor, Default: mm/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3_DisplacementY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementY <em>Displacement Y</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(double)
	 * @generated
	 */
	void unsetDisplacementY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getDisplacementY <em>Displacement Y</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das rotation-Attribut steuert die Drehung eines Graphic gegenüber seiner Definition. Die Drehung erfolgt um den Ursprung der Definition und wird im Gegenuhrzeigersinn entsprechend dem "mapAngleFactor" angegeben. Default ist die Angabe im Bogenmaß.
	 * 
	 * Fehlt das Attribut, so wird 0.0 angenommen. 
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben -erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Drehung (Attribut "drehwinkel"), so überschreibt diese die Angabe im rotation-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3_Rotation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getRotation <em>Rotation</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getRotation <em>Rotation</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Scalefactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das scalefactor-Attribut steuert die Skalierung (Vergrößerung/Verkleinerung) eines Graphic gegenüber seiner Definition. Die Skalierung erfolgt um den Ursprung der Definition. Sie wird angegeben als Skalierungsfaktor. Fehlt das Attribut wird 1.0 angenommen.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Skalierung (Attribut "skalierung"), so überschreibt diese die Angabe im scalefactor-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scalefactor</em>' attribute.
	 * @see #isSetScalefactor()
	 * @see #unsetScalefactor()
	 * @see #setScalefactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3_Scalefactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='scalefactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScalefactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getScalefactor <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalefactor</em>' attribute.
	 * @see #isSetScalefactor()
	 * @see #unsetScalefactor()
	 * @see #getScalefactor()
	 * @generated
	 */
	void setScalefactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getScalefactor <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScalefactor()
	 * @see #getScalefactor()
	 * @see #setScalefactor(double)
	 * @generated
	 */
	void unsetScalefactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getScalefactor <em>Scalefactor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scalefactor</em>' attribute is set.
	 * @see #unsetScalefactor()
	 * @see #getScalefactor()
	 * @see #setScalefactor(double)
	 * @generated
	 */
	boolean isSetScalefactor();

	/**
	 * Returns the value of the '<em><b>Halo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die für ein Graphic wirksame Halo-Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halo</em>' containment reference.
	 * @see #setHalo(HaloType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getGraphicType3_Halo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='halo' namespace='##targetNamespace'"
	 * @generated
	 */
	HaloType2 getHalo();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3#getHalo <em>Halo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Halo</em>' containment reference.
	 * @see #getHalo()
	 * @generated
	 */
	void setHalo(HaloType2 value);

} // GraphicType3
