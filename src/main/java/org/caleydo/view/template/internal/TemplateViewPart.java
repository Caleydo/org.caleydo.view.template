/*******************************************************************************
 * Caleydo - Visualization for Molecular Biology - http://caleydo.org
 * Copyright (c) The Caleydo Team. All rights reserved.
 * Licensed under the new BSD license, available at http://caleydo.org/license
 ******************************************************************************/
package org.caleydo.view.template.internal;

import org.caleydo.core.view.ARcpGLElementViewPart;
import org.caleydo.core.view.opengl.canvas.IGLCanvas;
import org.caleydo.core.view.opengl.layout2.AGLElementView;
import org.caleydo.view.template.internal.serial.SerializedTemplateSingleView;

/**
 *
 * @author AUTHOR
 *
 */
public class TemplateViewPart extends ARcpGLElementViewPart {

	public TemplateViewPart() {
		super(SerializedTemplateSingleView.class);
	}

	@Override
	protected AGLElementView createView(IGLCanvas canvas) {
		return new TemplateSingleView(glCanvas);
	}
}
